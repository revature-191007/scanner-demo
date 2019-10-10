package com.revature;

import java.util.Scanner;

/**
 * Scanner is a utility class that wraps around the input stream for system
 * input (System.in) to allow you to read the input stream as it comes in.
 * 
 * Scanner is frequently used to read keyboard input from users in console line
 * applications.
 * 
 * The alternative, Console (which is purpose built for this task), does not
 * work in Eclipse/Spring Tools Suite, because the environment the SST
 * application runs in (in the IDE) is not recognized as a console application,
 * so when you retrieve Console (using System.console()), it will be null.
 * 
 * @author Mitch
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type something: ");
		String keyboardInput = scanner.nextLine();
		System.out.println(keyboardInput);
		
		System.out.println("What is your age?");
		while (!scanner.hasNextInt()) {
			System.out.println("Type a number, silly");
			scanner.nextLine();
		}
		int age = scanner.nextInt();
		// If you get anything other than a nextLine and you are using
		// nextLine - flush the remaining line break from scanner using
		// nextLine()

		// clearing buffer
		scanner.nextLine();
		
		System.out.println("Type one more thing");
		keyboardInput = scanner.nextLine();
		System.out.println(keyboardInput);
		
	
	}
}
