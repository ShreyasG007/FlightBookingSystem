package com.tka.bookingSystem;

public class MainClass {

	public static void main(String[] args) {
		BookingSystem flightBooking = new FlightBooking();
		BookingSystem trainBooking = new TrainBooking();
		BookingSystem busBooking = new BusBooking();
		
		System.out.println("Flight Booking System");
		flightBooking.booking();
		flightBooking.managingReservation();
		flightBooking.handlingPayments();
		System.out.println();
		
		System.out.println("Train Booking System");
		trainBooking.booking();
		trainBooking.managingReservation();
		trainBooking.handlingPayments();
		System.out.println();
		
		System.out.println("Bus Booking System");
		busBooking.booking();
		busBooking.managingReservation();
		busBooking.handlingPayments();
		System.out.println();

	}

}
