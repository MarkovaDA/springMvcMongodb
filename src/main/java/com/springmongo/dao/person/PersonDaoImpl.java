package com.springmongo.dao.person;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.springmongo.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao{
	
	@Autowired
	@Qualifier("mongoTemplate")
	protected MongoTemplate mongoTemplate;
	
	public static final String COLLECTION_NAME = "person";
	
	@Override
	public void addPerson(Person person) {
		if (!mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.createCollection(Person.class);
		}		
//		person.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(person, COLLECTION_NAME);
	}
	
	@Override
	public List<Person> listPerson() {
		return mongoTemplate.findAll(Person.class, COLLECTION_NAME);
	}
	
	@Override
	public void deletePerson(Person person) {
		mongoTemplate.remove(person, COLLECTION_NAME);
	}
	
	@Override
	public void updatePerson(Person person) {
		mongoTemplate.insert(person, COLLECTION_NAME);		
	}
}
