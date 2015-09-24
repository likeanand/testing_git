package com.wipro.CoreExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	int a, b = 2;
	transient int x, y = 9;

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		Employee employee = new Employee(1, "hello");
		employee.setAge(26);
		employee.setName("vijaykrishna");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("employee.ser"));

		objectOutputStream.writeObject(employee);

		ObjectInputStream inputStream = new ObjectInputStream(
				new FileInputStream("employee.ser"));
		Employee employee2 = (Employee) inputStream.readObject();
		System.out.println(employee2.getAge());
		System.out.println(employee2.getName());

	}
}
