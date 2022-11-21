package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Branches;
import com.ty.dto.Person;
import com.ty.dto.hospital;

public class Maindao {

	public hospital savedata(hospital hospital) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}

	public void Personsave(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		//return person;
	}

	public void viewdatabyid(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		if (id != 0) {
			hospital h = entityManager.find(hospital.class, id);
			System.out.println(h);
		}
	}

	public void viewdatabypersonid(int i) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		if (i != 0) {
			Person p = entityManager.find(Person.class, i);
			System.out.println(p);
		}

	}
	
	public List<Branches> Branchfind() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Query query = (Query)entityManager.createQuery("Select s from Branches s");
		List <Branches> branches=query.getResultList();
		//for (Branches : branches) {
			
	//	}
		
		return  query.getResultList();
	}
	
	
	
	
	


//	public void findbynamebranch(String ii) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		if (ii != null) {
//			Branches branches = new Branches();
//			Encounter encounter = new Encounter();
//			Branches b = entityManager.find(Branches.class, ii);
//			System.out.println(b);
//	//	branches=(Branches)branches.setBranchname(b);
//		//	List<Branches> list = Arrays.asList(branches);
//			//encounter.setBranches(list);
//			//return ii;
//
//		}
//	}
}
