package com.movies;

import java.util.ArrayList;
import java.util.List;

public class Movie
{
	private String MovieName;
	private String TheatreName;
	private String location;
	
	
	
	
	
	public Movie(String MovieName, String TheatreName, String location) 
	{
		super();
		this.MovieName = MovieName;
		this.TheatreName = TheatreName;
		this.location = location;
	}
	
	
	public String getMovieName() 
	{
		return MovieName;
	}
	public void setMovieName(String movieName) 
	{
		MovieName = movieName;
	}
	public String getTheatreName() 
	{
		return TheatreName;
	}
	public void setTheatreName(String theatreName) 
	{
		TheatreName = theatreName;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public void displayMovieInfo()
	{
		System.out.println("MOVIE NAME:"+ MovieName +"		THEATRE NAME:"+ TheatreName + "		LOCATION:"+location);
	}
	
	
	
}
