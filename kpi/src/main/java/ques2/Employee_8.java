package ques2;

import ques_1.Employee_class;

public class Employee_8 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Sheetal";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Chouhan";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 435654;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Female";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Shajapur";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9134;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 12314;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 8 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e8=new Thread ("Employee 8");
		e8.start();
	}
}
