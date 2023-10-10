package com.ramoscode;

public class Person {

	private String firstName;
	private int age;
	private String endereco;
	
	public Person() {}
	
	public Person(String firstName, int age, String endereco) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.endereco = endereco;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
