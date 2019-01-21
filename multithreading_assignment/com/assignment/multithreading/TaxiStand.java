package com.assignment.multithreading;
import java.util.LinkedList;
import java.util.ListIterator;
public class TaxiStand{
	private int size = 5;
	private LinkedList<Taxi> taxiStand;
	private LinkedList<Taxi> taxiQueue;
	private LinkedList<Passenger> passengerQueue;
	public TaxiStand(int capacity, LinkedList<Taxi> q, LinkedList<Passenger> pq) {
		size = capacity;
		taxiQueue = q;
		passengerQueue = pq;
		taxiStand = new LinkedList<Taxi>();
		for(int i=0; i<size ; i++){
			taxiStand.add(new Taxi());
		}
		System.out.println("Creating a TaxiStand of size " + size);
		}
//Adding a Taxi from the Taxi Queue when one leaves the taxi stand when full 
public boolean addTaxi(){
synchronized(taxiQueue)
{
if(taxiQueue.isEmpty())
{
System.out.println(" Taxis are not available now");
return false;
}
else
{
	synchronized(taxiStand)
	{
		taxiStand.add(taxiQueue.pop());
	System.out.println("Removing Taxi from Queue");
	processPassengerQueue();
	return true;
	}
}

   }

    }



    public boolean isFull(){

        return (taxiStand.size()<size) ? false : true;

    }

    

    public boolean isEmpty() {

        return (taxiStand.size()==0) ? true : false;

    }



  //allocating the passenger a taxi , if no taxi is available add the passenger to the queue

    public boolean allocatePassenger(Passenger p) {

        synchronized(taxiStand)

        {

        	boolean taken = false;

        	for(Taxi t : taxiStand )

        	{
        		if(!t.isFull() && !t.isEmpty() && t.getDestination()==p.getDestination())
        		{
        			taken = t.allocatePassenger(p);
        			if(taken) 
        			{

        				if(t.isFull())

        				{
        					taxiStand.remove(t);

        					while(!addTaxi())

        					{

        						System.out.println("Waiting for the  Taxi ");

        						try{ Thread.sleep(1000); } catch(InterruptedException e) {}

        					}

        				}

        				break;

        			}

        		}

        	}

        	

        	if(!taken)
        	{
        		for(Taxi t : taxiStand)
	        	{
	        		if(t.isEmpty())
	        		{
	        			taken = t.allocatePassenger(p);
	        			if(taken) break;

	        		}
	        	}
        	}

        return taken;
}
        }

    public void processPassengerQueue(){

        synchronized(passengerQueue)

        {
        	synchronized(taxiStand)
        	{
        		if(!passengerQueue.isEmpty())
        		{
        			System.out.println("Checking the passengerQueue with " + passengerQueue.size() + " passengers");

					for(Passenger p : passengerQueue)
					{
						allocatePassenger(p);
						}
        			}
        		}
        }
        }

        public void printStatus() {
    	ListIterator<Taxi> standIterator = taxiStand.listIterator();
        int position=0;
        while(standIterator.hasNext()) {
        	Taxi taxi = standIterator.next();
            position++;
            System.out.println(position + ". to " + taxi.getDestination() + " passengers are = " + taxi.getpassengerCount());

        }
}
//Main thread 

    public static void main(String[] args) {

        System.out.println("Started.....");
        LinkedList<Taxi> taxiQueue = new LinkedList<Taxi>();
        LinkedList<Passenger> passengerQueue = new LinkedList<Passenger>();
        TaxiStand stand = new TaxiStand(10, taxiQueue, passengerQueue);

        TaxiQueueRunnable taxi = new TaxiQueueRunnable(taxiQueue, stand);
        PassengerQueueRunnable passenger = new PassengerQueueRunnable(passengerQueue, stand);

        Thread runTaxiQueue = new Thread(taxi, " TaxiQueueRunnable Thread");
        Thread runPassengerQueue = new Thread(passenger, " PassengerQueueRunnable Thread");

        runTaxiQueue.start();
        runPassengerQueue.start();
}
    }