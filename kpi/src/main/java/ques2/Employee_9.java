package ques2;

import ques_1.Employee_class;

public class Employee_9 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Abhitayu";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Sharma";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 342344;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Gwalior";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9187;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 13245;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 9 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e9=new Thread ("Employee 9");
		e9.start();
	}
}
