package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;
//testt

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Amrosy");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Mohammed");
		p.setLastName("Shalaby");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Basemmm");
		p.setLastName("Salama");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("AbdulHalim");
		p.setLastName("Mahmoud");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(25);
		p.setFirstName("this from webhook");
		p.setLastName("success");
		persons.add(p);
//test		
		p = new Person();
		p.setId("6");
		p.setAge(25);
		p.setFirstName("med ziyad hafri");
		p.setLastName("hafri");
		persons.add(p);
//new person
		p = new Person();
		p.setId("7");
		p.setAge(25);
		p.setFirstName("ahmed");
		p.setLastName("laggoun");
		persons.add(p);
		//new person
		p = new Person();
		p.setId("8");
		p.setAge(25);
		p.setFirstName("ahmed1");
		p.setLastName("laggoun1");
		persons.add(p);
//testt
		p = new Person();
		p.setId("9");
		p.setAge(25);
		p.setFirstName("ziyad");
		p.setLastName("hafri");
		persons.add(p);

		// New Person Added
		p = new Person();
		p.setId("10");
		p.setAge(25);
		p.setFirstName("ziyad");
		p.setLastName("hafri");
		persons.add(p);

		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

