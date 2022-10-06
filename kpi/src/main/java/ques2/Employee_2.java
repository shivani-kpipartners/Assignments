package ques2;

import ques_1.Employee_class;

public class Employee_2  extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Shivam";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Rai";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 23456;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Varanasi";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9110;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 23456;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 2 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e2=new Thread ("Employee 2");
		e2.start();
	}
}
