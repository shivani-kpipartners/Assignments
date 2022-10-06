package kpi;

import static org.junit.Assert.assertEquals;

import ques2.Employee_1;import ques2.Employee_10;import ques2.Employee_2; import ques2.Employee_3; import ques2.Employee_4; import ques2.Employee_5;import ques2.Employee_6;import ques2.Employee_7;import ques2.Employee_8;import ques2.Employee_9;

public class Test_Employee_class {

	public void evaluateExpression() {
		
		Employee_1 a1=new Employee_1();
		Employee_1 a2=new Employee_1();
		
		Employee_2 a3=new Employee_2();
		Employee_2 a4=new Employee_2();
		
		Employee_3 a5=new Employee_3();
		Employee_3 a6=new Employee_3();
		
		Employee_4 a7=new Employee_4();
		Employee_4 a8=new Employee_4();
		
		Employee_5 a9=new Employee_5();
		Employee_5 a10=new Employee_5();
		
		Employee_6 a11=new Employee_6();
		Employee_6 a12=new Employee_6();
		
		Employee_7 a13=new Employee_7();
		Employee_7 a14=new Employee_7();
		
		Employee_8 a15=new Employee_8();
		Employee_8 a16=new Employee_8();
		
		Employee_9 a17=new Employee_9();
		Employee_9 a18=new Employee_9();
		
		Employee_10 a19=new Employee_10();
		Employee_10 a20=new Employee_10();
		
		int b1=a1.Employee_id();
		int b2=a2.contact_number();
	
		int b3=a3.Employee_id();
		int b4=a4.contact_number();
		
		int b5=a5.Employee_id();
		int b6=a6.contact_number();
		
		int b7=a7.Employee_id();
		int b8=a8.contact_number();
		
		int b9=a9.Employee_id();
		int b10=a10.contact_number();
		
		int b11=a11.Employee_id();
		int b12=a12.contact_number();
		
		int b13=a13.Employee_id();
		int b14=a14.contact_number();
		
		int b15=a15.Employee_id();
		int b16=a16.contact_number();
		
		
		int b17=a17.Employee_id();
		int b18=a18.contact_number();
		
		int b19=a19.Employee_id();
		int b20=a20.contact_number();
	
		assertEquals(9196,b1);
		assertEquals(12345,b2);
		assertEquals(9110,b3);
		assertEquals(23456,b4);
		assertEquals(9167,b5);
		assertEquals(2673532,b6);
		assertEquals(9176,b7);
		assertEquals(343235445,b8);
		assertEquals(9180,b9);
		assertEquals(435436,b10);
		assertEquals(9173,b11);
		assertEquals(45466,b12);
		assertEquals(9199,b13);
		assertEquals(442332,b14);
		assertEquals(9134,b15);
		assertEquals(435654,b16);
		assertEquals(9187,b17);
		assertEquals(342344,b18);
		assertEquals(9177,b19);
		assertEquals(3536464,b20);
	
	}
}
