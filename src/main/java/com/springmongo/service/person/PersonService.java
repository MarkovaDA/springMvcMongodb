package com.springmongo.service.person;

import java.util.List;

import com.springmongo.model.Person;

public interface PersonService {
	
	public void addPerson(Person person);
	
	public List<Person> getPersonList();
	
	public void deletePerson(Person person);
	
	public void updatePerson(Person person);
}
