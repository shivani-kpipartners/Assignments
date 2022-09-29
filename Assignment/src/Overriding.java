
public class Overriding {
	   public void say() {
	      System.out.println("This is class Overriding");
	   }}

class Overriding_child_class extends Overriding {
	   public void say() {
	       super.say();
	      System.out.println("This is class Overriding_child_class");
	   }}

class New {
	   public static void main(String args[]) {

		   Overriding a = new Overriding(); 
		   Overriding b = new Overriding_child_class(); 

	      a.say(); // runs the method in Overriding class
	      b.say(); // runs the method in Overriding_child_class class
	   }}

