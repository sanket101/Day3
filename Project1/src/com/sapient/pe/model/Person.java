package com.sapient.pe.model;

public class Person {
	
	private String name;
	private int age;
	private String mob_number;
	private String gender;
	
	public Person(String name, int age, String mob_number, String gender) {
		this.name = name;
		this.age = age;
		this.mob_number = mob_number;
		this.gender = gender;
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

	public String getMob_number() {
		return mob_number;
	}

	public void setMob_number(String mob_number) {
		this.mob_number = mob_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
