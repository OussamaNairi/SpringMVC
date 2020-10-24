package tn.essat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.essat.dao.IDepartementDao;
import tn.essat.dao.IEmployeDao;
import tn.essat.dao.IProjetDao;
import tn.essat.model.Departement;
import tn.essat.model.Employe;
import tn.essat.model.Projet;

@Controller
public class AppTest {
	@Autowired
	IDepartementDao daod;
	@Autowired
	IProjetDao daop;
	@Autowired
	IEmployeDao daoe;
	
	public void setDaod(IDepartementDao daod) {
		this.daod = daod;
	}
	public void setDaoe(IEmployeDao daoe) {
		this.daoe = daoe;
	}
    public void setDaop(IProjetDao daop) {
	this.daop = daop;
    }
    
    @GetMapping("/home")
    public String get1(Model m) {
    	List<Departement> liste=daod.findAll();
    	m.addAttribute("liste", liste);
    	return "page1";
    }
    
    @GetMapping("/ajoutProjet")
    public String get2(Model m) {
    	Projet p=new Projet();
    	List<Departement> depts=daod.findAll();
    	m.addAttribute("depts", depts);
    	m.addAttribute("pr", p);
    	return "formProjet";
    }
    
    @PostMapping("/saveProjet")
    public String get3(Model m,@ModelAttribute("pr") Projet p) {
    	daop.save(p);
    	return "redirect:/home";
    }
    
    @GetMapping("/projets/{id}")
    public String get4(Model m,@PathVariable("id") int id) {
    	List<Projet> liste=daop.getAllProjetByDept(id);
    	Departement dept=daod.findOne(id);
    	m.addAttribute("dept",dept);
    	m.addAttribute("liste",liste);
    	return "projets";
    }
    
    @GetMapping("/employes/{id}")
    public String get5(Model m,@PathVariable("id") int id) {
    	List<Employe> liste=daoe.getAllEmpByDep(id);
    	Departement dept=daod.findOne(id);
    	m.addAttribute("dept",dept);
    	m.addAttribute("liste",liste);
    	return "employes";
    }
    
    @GetMapping("/ajoutEmploye")
    public String get6(Model m) {
    	Employe p=new Employe();
    	List<Departement> depts=daod.findAll();
    	List<Projet> projets=daop.findAll();
    	m.addAttribute("depts", depts);
    	m.addAttribute("projets", projets);
    	m.addAttribute("pr", p);
    	return "formEmploye";
    }
    
    @PostMapping("/saveEmploye")
    public String get7(Model m,@ModelAttribute("pr") Employe p) {
    	daoe.save(p);
    	return "redirect:/home";
    }
}
