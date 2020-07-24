package com.epam.Collections;

public class Main 
{
	public static void main(String[] args) 
	{	
		CustomList<String> myList = new CustomList<String>();     
        myList.add("Epam");
        myList.add("Task");
        myList.add("Submission"); 
        System.out.println("List: " + myList.toString());
        myList.delete(0);
        System.out.println("After Deleting " + myList.toString());           
	}
}
