package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.User;

public class UserDao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hospital");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction;
	
	
public boolean saveUser(User user) {
		
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return true;
		
	}
	
	
	
	public User validateUser(String email,String password) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		
		Query query2=entityManager.createQuery("Select u from User u");
		List<User> users = query.getResultList();
		
		for(User u: users) {
			
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return u;
				
			}
		}
	
		return null;
	}
	
}