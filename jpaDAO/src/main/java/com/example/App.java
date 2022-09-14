package com.example;

import com.example.dao.DAO;
import com.example.daoimpl.DaoImpl;
import com.example.entity.Person;

public class App {
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setId(100);
		p1.setName("amitava");
		p1.setEmail("a@gmail.com");

		DAO ref = new DaoImpl();
		if (ref.addPerson(p1))
			System.out.println("Person is stored in DB ");
		else
			System.out.println("--------------sorry--------------------");

	}
}
