package com.main.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.movies.Movie;
import com.theatres.Ticketing;

public class TheatreTicketDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Movie> mov = new ArrayList<Movie>();
		ArrayList<Ticketing> tic = new ArrayList<Ticketing>();
		
		mov.add(new Movie("bst","mayajal","ecr"));
		mov.add(new Movie("bst","vetri","chromepet"));
		mov.add(new Movie("kgf","spencer","royapetah"));
		mov.add(new Movie("don","ExprAv","royapetah"));
		mov.add(new Movie("krk","vetri","chromepet"));
		mov.add(new Movie("don","janatha ","pallavaram"));
		mov.add(new Movie("krk"," galada","pallavaram"));
		mov.add(new Movie("don","varadha ","chromepet"));
		mov.add(new Movie("kgf","ExprAv","royapetah"));
		mov.add(new Movie("don","satyam","royapetah"));
		mov.add(new Movie("bst","spencer","royapetah"));
		mov.add(new Movie("kgf","vetri","chromepet"));
		
		for(Movie m : mov)
		{
			m.displayMovieInfo();
		}
		
		int userOption = 1;
		int booked=0;
		int count=0;
		Scanner scanner = new Scanner(System.in);
		
		while(userOption == 1)
		{
			System.out.println("\n\nEnter 1 to book and 2 to exit....::");
			userOption = scanner.nextInt();
			
			if(userOption == 1)
			{
				//Booking booking = new Booking()
				Ticketing ticketing = new Ticketing();
				//ticketing.input();
//				String a;
//				String b;
//				String c;
				
				for(int i=0; i<mov.size(); i++) 
				{
					Movie m=mov.get(i);
//					if(m.getMovieName().equalsIgnoreCase(ticketing.MovName)&& m.getTheatreName().equalsIgnoreCase(ticketing.TheatreName)&& m.getLocation().equalsIgnoreCase(ticketing.Location))
//						
//					{
//						System.out.println("ticket reserved....");
//					}
//					else
//					{
//						System.err.println("-----WRONG SELECTION---");
//					}
					
					
//					Create an array list of object with class(Movie -> name, streamingTheatre, location). 
//					Count the number of same movies that are running in same location but different theatres. 
//					Similarly count the number of movies that are running in same theatre. 
//					You have to use collection for doing the same..
//					
//					if(m.getMovieName().equalsIgnoreCase(ticketing.MovName)&&m.getLocation().equalsIgnoreCase(ticketing.Location ))
//					{
//						booked++;
//						
//					}
					
					if(m.getLocation().equalsIgnoreCase(ticketing.Location))
					{
						count++;
					}
				
				}
				//System.out.println(booked+" number of same movies that are running in same location are there.....");
				System.out.println(count+" number of movies that are running in same theatre are there ");
			}
		}
		
		
		
	}

}

