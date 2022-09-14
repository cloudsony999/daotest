package com.example.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.DatabaseConfig;
import com.example.dao.DAO;
import com.example.entity.Person;

public class DaoImpl implements DAO {

	public boolean addPerson(Person p1) {
		// TODO Auto-generated method stub
		boolean b = false;

		Session session = DatabaseConfig.getSession();
		System.out.println("got a session " + session);

		p1.setId(100);
		p1.setName("amitava");
		p1.setEmail("a@gmail.com");
		Transaction tr = session.beginTransaction();
		int id = (int) session.save(p1);
		if (id > 0) {
			b = true;
			tr.commit();
		} else {
			b = false;
			tr.rollback();
		}

		session.close();
		System.out.println("--------------object saved using hibernate--------------------");

		return b;
	}

}
