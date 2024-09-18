import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Sam
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Madlib, my name's Kratos and you WILL answer my questions or die a gruesome death!");
		System.out.println("Now...let's begin, give me your name ."); 
		String name = in.nextLine();
		System.out.println("Alright, give me a country "+name+" Kratos says in a rather mockey voice.");
		String country = in.nextLine(); 
		System.out.println("Really "+country+"? alright..give me a number now.");
		int number = in.nextInt(); 
		//flush
		in.nextLine();
		System.out.println("You thought you were funny picking that number don't you? Give me a sport you humans like to play a lot.");
		String sport = in.nextLine(); 
		System.out.println("Ofcourse you would pick "+sport+", alright give me a day of the week next.");
		String dayOfWeek = in.nextLine();
		System.out.println("On "+dayOfWeek+", "+name+" went to "+country+" and played "+sport+" with the jersey number "+number+" but unfortunatly died from an injury after their game of "+sport+". ");
		
		
	
	
	}

}
