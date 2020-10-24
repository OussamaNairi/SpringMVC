package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.essat.model.Projet;
@Repository
public interface IProjetDao extends JpaRepository<Projet, Integer>{
	
	@Query("select p from Projet p where p.dept.id=?1")
	public List<Projet> getAllProjetByDept(int id);

}
