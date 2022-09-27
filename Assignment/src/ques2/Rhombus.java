package ques2;

public class Rhombus implements Shape,Polygon{

	@Override
	public void edges(int a) {
		// TODO Auto-generated method stub
		System.out.println(8);
	}

	@Override
	public void vertices(int b) {
		// TODO Auto-generated method stub
		System.out.println(8);
	}

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
	System.out.println("The area of the rectangle is " + (5 * 8));
	}

	
	
	@Override
	public boolean enclosed() {
		// TODO Auto-generated method stub
		return true;
	}

}
