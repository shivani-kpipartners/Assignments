package ques2;

import ques_1.Employee_class;

public class Employee_4 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Mohit";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Mishra";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 343235445;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Satna";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9176;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 23123;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 4 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e4=new Thread ("Employee 4");
		e4.start();
	}
}
