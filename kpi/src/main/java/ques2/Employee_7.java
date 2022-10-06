package ques2;

import ques_1.Employee_class;

public class Employee_7 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Chetna";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Pardeshi";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 442332;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Female";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Gujrat";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9199;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 23456;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 7 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e7=new Thread ("Employee 7");
		e7.start();
	}
}
