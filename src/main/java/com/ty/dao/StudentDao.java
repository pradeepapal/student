package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;
import com.ty.dto.User;


public class StudentDao {

	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	private EntityManager getEntityManager() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Student");
		return entityManagerFactory.createEntityManager();	
	}
	
	
	public boolean saveStudent(Student student) {
		
		entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return true;
		
	}
	
	public List<Student> getAllStudents(){
		entityManager=getEntityManager();
		Query query=entityManager.createQuery("select s from Student s");
		return query.getResultList();
				
	}
	
	public boolean deleteStudent(int id) {

		entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		Student u= entityManager.find(Student.class, id);
		if(u!=null) {
			System.out.println("delete method");
			entityTransaction.begin();
			entityManager.remove(u);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	
	public void updateStudent(Student u) {

		entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(u);
		entityTransaction.commit();
		
	}
	
	public Student getStudentById(int id) {
		entityManager=getEntityManager();
		entityTransaction=entityManager.getTransaction();
		return entityManager.find(Student.class, id);
	}
	
	
	
	
	
}
