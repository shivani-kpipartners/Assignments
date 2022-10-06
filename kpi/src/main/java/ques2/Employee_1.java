package ques2;

import ques_1.Employee_class;

public class Employee_1 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Shivani";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Shukla";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 12345;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Female";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Indore";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9196;
	}
	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 12345;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 1 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e1=new Thread ("Employee 1");
		e1.start();
	}
	

}
