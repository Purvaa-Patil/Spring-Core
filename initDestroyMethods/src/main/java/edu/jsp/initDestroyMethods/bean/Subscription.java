package edu.jsp.initDestroyMethods.bean;

public class Subscription {

	public Subscription() {
		System.out.println("bean Created");
	}
	public void verify() {
		System.out.println("verified");
	}
	public void destroy() {
		System.out.println("bean Destory");
	} 
	
}
