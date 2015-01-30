package com.kuroshfarsimadan.demonstration.util;
import java.util.Scanner;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class PasswordEncoder {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StandardPasswordEncoder spe = new StandardPasswordEncoder();
		System.out.print("Write the password: ");
		String password = input.nextLine();
		String encryption = spe.encode(password);
		System.out.println("The password is encrypted in the following way: " + encryption);
	}

}
