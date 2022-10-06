package ques6;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		
	// creating String type Arraylists
	ArrayList<String> Employees = new ArrayList<String>();
	
	Employees.add("Shivani Shukla");
	Employees.add("Siddhi Jain");
	Employees.add("Mohit Mishra");
	Employees.add("Sonam Vohra");
	Employees.add("Siddhi Jain");
	
	ArrayList<String> Students = new ArrayList<String>();
	
	Students.add("Shivani");
	Students.add("Siddhi");
	Students.add("Sonam Vohra");
	Students.add("Mohit");
	
	ArrayList<String> Friends = new ArrayList<String>();
	
	Friends.add("A");
	Friends.add("B");
	Friends.add("C");
	Friends.add("D");
	Friends.add("E");
	Friends.add("Sonam Vohra");
	
	ArrayList<String> Parent = new ArrayList<String>();
	
	Parent.add("ABCD");
	Parent.add("Sonam Vohra");

	
	ArrayList<String> CEO = new ArrayList<String>();
	
	CEO.add("Sonam Vohra");
	CEO.add("Anshul Swami");
	CEO.add("Karan Adani");
	
	
	Employees.retainAll(Students);
	  
    // print list 1
	System.out.println("Common elements: "
                       + Employees);
    
    // using IndexOf() to find first index of 6
    int pos1 =Employees.indexOf("Sonam Vohra");
      
    // using lastIndexOf() to find last index of 6
    int pos2 =Students.lastIndexOf("Sonam Vohra");
    
 // printing first index of 6
    System.out.println("The first occurrence of Sonam is  : " + pos1);
      
    // printing last index of 6
    System.out.println("The last occurrence of Sonam is  : " + pos2);
}}
