package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Employe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "proj_id")
    private Projet proj;
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Departement dept;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(Integer id, String nom, Projet proj, Departement dept) {
		super();
		this.id = id;
		this.nom = nom;
		this.proj = proj;
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Projet getProj() {
		return proj;
	}
	public void setProj(Projet proj) {
		this.proj = proj;
	}
	public Departement getDept() {
		return dept;
	}
	public void setDept(Departement dept) {
		this.dept = dept;
	}
    
}
