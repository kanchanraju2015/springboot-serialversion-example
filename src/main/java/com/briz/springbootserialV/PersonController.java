package com.briz.springbootserialV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
	@Autowired
	PersonRepository prepo;
@RequestMapping("/test")
public String test()
{
	return "this is serial test";
}
@RequestMapping("/save")
public Person person()
{
	Person p=new Person();
	p.setAge(22);
	p.setCity("dhanbad");
	p.setName("ramu kumar");
	//return prepo.save(p);// this is also valid please use this 
	prepo.save(p);
	return p;
}
}
