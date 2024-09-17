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
		System.out.println("Welcome to MadLib!");
		System.out.println("Give me a name");
		String name = in.nextLine();
		System.out.println("Give me a country");
		String country = in.nextLine(); 
		System.out.println("Give me a number");
		int number = in.nextInt(); 
		//flush
		in.nextLine();
		System.out.println("GIve me a sport");
		String sport = in.nextLine(); 
		System.out.println("Give me a dayOfWeek");
		String dayOfWeek = in.nextLine();
		System.out.println("On "+dayOfWeek+", "+name+" went to "+country+" and played "+sport+" as the number "+number+""); 
		
		
	
	
	}

}
