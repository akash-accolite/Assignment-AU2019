package com.assignment.multithreading;
import java.util.LinkedList;
import java.util.Random;
public class PassengerQueueRunnable implements Runnable {
TaxiStand stand;
LinkedList<Passenger> passengerQueue;
int queueNumber=0;
public PassengerQueueRunnable(LinkedList<Passenger> queue, TaxiStand l) {
	this.passengerQueue = queue;
	stand = l;
	}
public void run() {
	while(true) {
		try {Thread.sleep(3000);} catch(Exception ie) {}

            int take = new Random().nextInt(Passenger.DESTINATION.values().length);

            Passenger p = new Passenger(Passenger.DESTINATION_VALUES[take]);

         
 synchronized(stand)
 {
	 if(!stand.allocatePassenger(p)) {
		synchronized(passengerQueue)
		 {
			 passengerQueue.add(p);
			 System.out.println("no cab for Passeneger , passenger is added to queue. Queue Length " + passengerQueue.size());
		}
		}
	 }
 }
	}
}