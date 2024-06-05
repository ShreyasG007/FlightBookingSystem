package com.tka.bookingSystem;

import java.util.Scanner;

public class userDetails {
	Scanner scanner = new Scanner(System.in);

	public int userId;
	public String userName;
	public String sourceLocation;
	public String destinationLocation;

	public void acceptDetails() {
		System.out.println("Enter User id:");
		this.userId = scanner.nextInt();

		System.out.println("Enter User Name : ");
		this.userName = scanner.next();

		System.out.println("Enter sourceLocation : ");
		this.sourceLocation = scanner.next();

		System.out.println("Enter destinationLocation : ");
		this.destinationLocation = scanner.next();

	}

	public void displayDetails() {
		System.out.println("Enter User id : "+userId);

		System.out.println("Enter User Name : "+userName);

		System.out.println("Enter sourceLocation : "+sourceLocation);

		System.out.println("Enter destinationLocation : "+destinationLocation);

	}
}
