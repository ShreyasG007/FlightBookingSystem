package com.tka.bookingSystem;

public class TrainBooking implements BookingSystem {

	userDetails trainDetails = new userDetails();

	@Override
	public void booking() {
		trainDetails.acceptDetails();
		trainDetails.displayDetails();
		System.out.println("Train Booking Completed");

	}

	@Override
	public void managingReservation() {
		boolean isReservation = true;
		if (isReservation) {
			System.out.println("Train Reservation is Confirmed");
		} else {
			System.out.println("Train Reservation is cancelled or it is in waiting list");
		}

	}

	@Override
	public void handlingPayments() {
		boolean isPayment = false;
		if (isPayment) {
			System.out.println("Train payment is done");
		} else {
			System.out.println("Train Payment is cancelled");
		}
	}

}
