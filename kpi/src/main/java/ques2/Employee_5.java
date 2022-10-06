package ques2;

import ques_1.Employee_class;

public class Employee_5 extends Employee_class implements Runnable{

	@Override
	public String first_name() {
		// TODO Auto-generated method stub
		return "Sonam";
	}

	@Override
	public String middle_name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String last_name() {
		// TODO Auto-generated method stub
		return "Vohra";
	}

	@Override
	public int contact_number() {
		// TODO Auto-generated method stub
		return 435436;
	}

	@Override
	public String gender() {
		// TODO Auto-generated method stub
		return "Female";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Punjab";
	}

	@Override
	public int Employee_id() {
		// TODO Auto-generated method stub
		return 9180;
	}

	@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 10982;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Employee 5 is using thread");
	}
	
	public static void main(String args[]) {
		Thread e5=new Thread ("Employee 5");
		e5.start();
	}
}
