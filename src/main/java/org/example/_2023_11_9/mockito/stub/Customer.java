package org.example._2023_11_9.mockito.stub;

public class Customer {
	String name;
	long id;
	public Customer(){
		this(-1);
	}
	public Customer(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
}