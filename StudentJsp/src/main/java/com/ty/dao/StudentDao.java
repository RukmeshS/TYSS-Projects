package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;

public class StudentDao {
	
	public Student save(Student student){
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb9");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
	return student;
	
	}
	
	public Student findbyemail(String email){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb9");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	Query query =entityManager.createQuery("select s from Student s where s.email=?1");
	return( Student)query.setParameter(1, email).getSingleResult();
	
}
	
	public List<Student> getallstudent(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb9");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
	Query query =entityManager.createQuery("Select s from Student s ");
	List <Student>students = query.getResultList();
	return students;
	
}

	public Student findbyId(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb9");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Student.class, id);
	}

}
