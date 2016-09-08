package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput;
	
	public StupidController()
	{
		myName = "Grayson Palesh";
		readKeyboardInput = new Scanner(System.in);	
	}
	
	public void start()
	{
		System.out.println("This is slightly less stupid :D");
		System.out.println(myName);	
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput);
	}
}
