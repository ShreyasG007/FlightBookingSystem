package com.tka.bookingSystem;

public class FlightBooking implements BookingSystem {
	userDetails flightDetails = new userDetails();
	
	@Override
	public void booking() {
		flightDetails.acceptDetails();
		flightDetails.displayDetails();
		System.out.println("Flight Booking Completed");

	}

	@Override
	public void managingReservation() {
		boolean isReservation = false;
		if(isReservation){
			System.out.println("Flight Reservation is Confirmed");
		}
		else {
			System.out.println("flight Reservation is cancelled or it is in waiting list");
		}

	}

	@Override
	public void handlingPayments() {
		boolean isPayment = true;
		if (isPayment) {
			System.out.println("Flight payment is done");
		} else {
			System.out.println("Flight Payment is cancelled");
		}
	}

}
