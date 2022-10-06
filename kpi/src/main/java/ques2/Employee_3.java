package ques2;

import ques_1.Employee_class;

public class Employee_3 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Siddhi";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return "Rakesh";
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Jain";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 2673532;
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
		return 9167;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 23842;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 3 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e3=new Thread ("Employee 3");
		e3.start();
	}
}
