package edu.jsp.ioccontainer.bean;

public class Student {

	private int id;
	private String name;
	private int age;
	private int contact;
	
	public void greet() {
		System.out.println("hello ");
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
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Student() {
		super();
	}
	
	
	
}
