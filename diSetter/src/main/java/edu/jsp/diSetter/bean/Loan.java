package edu.jsp.diSetter.bean;

public class Loan {

	private int id;
	private String name;
	private String bank;
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
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Loan() {
		super();
	}
	
	public void display() {
		System.out.println("Name: "+this.name+" Bank : "+this.getBank());
	}
	
}
