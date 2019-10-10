package com.revature;

import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("Enter username: ");
		String username = console.readLine();
		
		System.out.print("Enter password: ");
		char[] password = console.readPassword();
		
		System.out.println(username);
		System.out.println(new String(password));
	}
}
