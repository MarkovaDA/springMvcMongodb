package com.springmongo.dao.person;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmongo.model.Person;

@Repository
public interface PersonDao {
	
	public void addPerson(Person person);
	
	public List<Person> listPerson();
	
	public void deletePerson(Person person);
	
	public void updatePerson(Person person);
}
