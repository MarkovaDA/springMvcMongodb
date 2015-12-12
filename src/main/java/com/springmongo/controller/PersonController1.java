//package com.springmongo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.View;
//import org.springframework.web.servlet.view.RedirectView;
//
//import com.yiyuwanglu.basecore.model.Person;
//import com.yiyuwanglu.basecore.service.PersonService;
//   
//@Controller    
//public class PersonController1 {  
//   
//	@Autowired
//	private PersonService personService;
//	
////	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
////	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
//
//	@RequestMapping(value = "/person1", method = RequestMethod.GET)  
//	public String getPersonList(ModelMap model) { 
////    	List<Person> listUser = mongoOperation.findAll(Person.class);
////		System.out.println("Number of Person = " + listUser.size());
//    	
//    	List<Person> listPerson =  personService.listPerson();
//    	
//        model.addAttribute("personList", listPerson);  
//        return "output";  
//    }  
//    
//    @RequestMapping(value = "/person/save1", method = RequestMethod.POST)  
//	public View createPerson(@ModelAttribute Person person, ModelMap model) {
//    	if(StringUtils.hasText(person.getId())) {
//    		personService.updatePerson(person);
//    	} else {
//    		personService.addPerson(person);
//    	}
//    	// save
////    	Person person1 = new Person("DDD");
////    	mongoOperation.save(person);
//    	
//    	return new RedirectView("/springmvc_mongodb/person");  
//    }
//        
//    @RequestMapping(value = "/person/delete1", method = RequestMethod.GET)  
//	public View deletePerson(@ModelAttribute Person person, ModelMap model) {  
//        personService.deletePerson(person);  
//        return new RedirectView("/springmvc_mongodb/person");  
//    }    
//}
