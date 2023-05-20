package com.json.model;

public class Person {

	private int id ; 
	
	private String name ;
	
	private int age ; 
	
	private Phone phones ;

	public Person() {
		super();
	}

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

	public Phone getPhones() {
		return phones;
	}

	public void setPhones(Phone phones) {
		this.phones = phones;
	} 
	
}
