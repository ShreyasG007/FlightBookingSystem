package com.tka.bookingSystem;

public class BusBooking implements BookingSystem {

	userDetails busDetails = new userDetails();

	@Override
	public void booking() {
		busDetails.acceptDetails();
		busDetails.displayDetails();
		System.out.println("Bus Booking Completed");

	}

	@Override
	public void managingReservation() {
		boolean isReservation = true;
		if (isReservation) {
			System.out.println("Bus Reservation is Confirmed");
		} else {
			System.out.println("Bus Reservation is cancelled or it is in waiting list");
		}

	}

	@Override
	public void handlingPayments() {
		boolean isPayment = true;
		if (isPayment) {
			System.out.println("Bus payment is done");
		} else {
			System.out.println("Bus Payment is cancelled");
		}
	}

}
