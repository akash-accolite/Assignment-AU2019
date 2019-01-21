package com.assignment.multithreading;
import java.util.LinkedList;
public class TaxiQueueRunnable implements Runnable {

	private LinkedList<Taxi> taxiQueue;
	private TaxiStand taxiStand;
	public TaxiQueueRunnable(LinkedList<Taxi> q, TaxiStand l){
		taxiQueue = q;
		taxiStand = l;
}
public void run() {
System.out.println("taxiQueue Thread started...");
while(true) {try {	Thread.sleep(50000);} catch (Exception ie) {}
taxiQueue.add(new Taxi());
}
}}