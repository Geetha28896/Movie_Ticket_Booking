package com.theatres;

import java.util.Scanner;

public class Ticketing 
{
	//String name;
	//int age;
	public String MovName;
	public String TheatreName;
	public String Location;
	//int howManyTickets;
	
	public Ticketing() 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("\nENTER THE MOVIE NAME::::");
		String mname = sc1.next();
		MovName=mname;
		
		System.out.println("\nENTER THE THEATRE NAME::");
		String tname = sc1.next();
		TheatreName=tname;
		
		System.out.println("\nENTER THE LOCATION YOU PREFER::");
		String loc = sc1.next();
		Location=loc;
		
		
	}
}
