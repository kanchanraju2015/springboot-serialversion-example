package com.briz.springbootserialV;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity(name="employee")
public class Person implements Serializable 
{
	private static final long serialVersionUID = 1L;
	// static means all classes will share this and it is not changable i.e final
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
//@Transient this annotation does not serialize the data 
int age;
String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}

