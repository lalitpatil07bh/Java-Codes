package com;

public class Cricketer 
{
	private String name;
	private int age;
	private String email;
	private long phno;
	private int rating;
	
	
	public Cricketer(String name, int age, String email, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.rating = rating;
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

	public String getEmail() {
		return email;
	}

	public long getPhno() {
		return phno;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email=" + email + ", phno=" + phno + ", rating=" + rating
				+ "]";
	}

}
