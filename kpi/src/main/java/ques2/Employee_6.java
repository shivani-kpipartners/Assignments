package ques2;

import ques_1.Employee_class;

public class Employee_6 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Roshan";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Yadav";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 45466;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Banaras";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9173;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 98733;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 6 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e6=new Thread ("Employee 6");
		e6.start();
	}
}
