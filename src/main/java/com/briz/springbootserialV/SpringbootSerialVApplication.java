package com.briz.springbootserialV;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSerialVApplication {

	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(SpringbootSerialVApplication.class, args);
		FileOutputStream fout=new FileOutputStream("kk.ser");
		ObjectOutputStream os=new ObjectOutputStream(fout);
		Person p=new Person();
		p.setAge(34);
		p.setCity("ranchi");
		p.setId(21);
		p.setName("lallu");
		os.writeObject(p);
		System.out.println("peson data is serialized with serial v 1L");		
	}
}
