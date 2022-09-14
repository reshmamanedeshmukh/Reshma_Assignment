package com.yash.fifth;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Rail Recservation System");
			System.out.println();
			System.out.println("*******************************************************************");
			System.out.println();
			System.out.println("Enter the Tatkal/Normal Class Type");

			Scanner scanner = new Scanner(System.in);

			String booking = scanner.next();

			if (booking.equalsIgnoreCase("Tatkal") || booking.equalsIgnoreCase("Normal")) {

				if (booking.length() > 1) {

					
					NormalTicketBooking.getNormalTicket(booking);
					TatkalBooking.getTatkalTicket(booking);
					
					System.out.println();

					scanner.close();

				}

			} else {
				System.out.println("You have entered wrong Option");
				System.out.println();
				main(args);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
