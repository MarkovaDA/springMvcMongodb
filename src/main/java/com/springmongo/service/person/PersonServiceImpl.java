package com.springmongo.service.person;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.springmongo.dao.person.PersonDao;
import com.springmongo.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
    private PersonDao personDao;
	
	public static final String COLLECTION_NAME = "person";
	
	public void addPerson(Person person) {
		personDao.addPerson(person);;
	}
	
	public List<Person> getPersonList() {
		return personDao.listPerson();
	}
	
	public void deletePerson(Person person) {
		personDao.deletePerson(person);
	}
	
	public void updatePerson(Person person) {
		personDao.updatePerson(person);
	}

}
