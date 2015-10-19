package slo.controller;

import slo.view.SLODisplay;

public class SLOController 
{
	private SLODisplay myPopups;
	
	public SLOController()
	{
		myPopups = new SLODisplay();
	}
		
	public void start()
	{
		String userName = myPopups.grabAnswer("Type in your name.");
		myPopups.showResponse("Hello, " + userName + "! My name is Colm.");
		myPopups.showResponse("Your name is " + userName.length() + " characters long.");
		
		String car = myPopups.grabAnswer("Do you have a car? Type in true or false.");
		Boolean usercar = Boolean.parseBoolean(car);
		myPopups.showResponse("It is " + usercar + " that you have a car.");
		
		int myAge = 18;
		String age = myPopups.grabAnswer("Type in your age.");
		int userAge = Integer.parseInt(age);
		if(userAge > myAge)
		{
			int diff = userAge - myAge;
			myPopups.showResponse("You are " + diff + " year(s) older than me.");
		}
		else if(userAge < myAge)
		{
			int diff = myAge - userAge;
			myPopups.showResponse("I am " + diff + " year(s) older than you.");
		}
		else
		{
			myPopups.showResponse("We are the same age!");
		}
		
		double myHeight = 6.25;
		String height = myPopups.grabAnswer("Type in your height as a decimal.");
		double userHeight = Double.parseDouble(height);
		if(userHeight > myHeight)
		{
			double diff = userHeight - myHeight;
			myPopups.showResponse("You are " + diff + " feet taller than me.");
		}
		else if(userHeight < myHeight)
		{
			double diff = myHeight - userHeight;
			myPopups.showResponse("I am " + diff + " feet taller than you.");
		}
		else
		{
			myPopups.showResponse("We are the same height!");
		}
	}
}
