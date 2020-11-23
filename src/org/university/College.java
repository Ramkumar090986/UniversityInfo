package org.university;

public class College extends University {
	public void ug() {
		System.out.println("UG courses in SRM is Comaprable");

	}
	public void pg() {
		System.out.println("PG courses in SRM is low");
	}
	public void physiotheraphy() {
	System.out.println("Physiotherpahy");

	}
public static void main(String[] args) {
	College c1=new College();
	c1.ug();
	c1.pg();
}
}
