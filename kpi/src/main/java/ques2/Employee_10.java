package ques2;

import ques_1.Employee_class;

public class Employee_10 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Partheev";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Boora";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 3536464;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Hyderabad";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9177;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 237478;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 10 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e10=new Thread ("Employee 10");
		e10.start();
	}
}
