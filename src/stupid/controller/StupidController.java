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
		
		System.out.println("How was your day?");
		String userInput1 = readKeyboardInput.nextLine();
		System.out.println("That's good my day was good too " + userInput1);
		
		System.out.println("What did you learn in class today?");
		String userInput2 = readKeyboardInput.next();
		System.out.println("Sweet! I learned how to talk to other people " + userInput2);
		
		System.out.println("Can you count to Five?");
		double userInput3 = readKeyboardInput.nextDouble();
		System.out.println("5" + userInput3);
		
	}
}
