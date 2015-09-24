package com.wipro.CoreExamples;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1386618055351940943L;
	int age;
	String name;

	public Employee(int age, String name) {

		if ((age == 26) && (name.equals("Vijay"))) {
			this.age = age;
			this.name = name;
		} else {
			this.age = age;
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
