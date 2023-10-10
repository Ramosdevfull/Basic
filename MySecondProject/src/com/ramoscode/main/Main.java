package com.ramoscode.main;

import com.ramoscode.Person;

public class Main {

	public static void main(String[] args) {
		// Instanciando classes
		
		Person p = new Person();
		p.setFirstName("Maria Alice");
		System.out.println("Nome: " + p.getFirstName());
		
		Person p1 = new Person("Ademario", 44, "Rua Hercules Malatesta, 44");
		
		System.out.println("Nome: " + p1.getFirstName());
	}

}
