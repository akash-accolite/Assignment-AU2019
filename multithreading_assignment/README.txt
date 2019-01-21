passenger.java:
	this java class contains the destination and it will be allocated to
	taxis.
PassengerQueueRunnable.java:
	This java class will take the passenger and try to allocate any taxi to the passenger
	.if taxi is not available then add the passenger to passenger queue
Taxi.java:
	This class controls the taxi.new taxi will be added to this class. This will set and get the capacity of the taxi.
TaxiQueueRunnable.java:
	This class controls the thread for each taxi. it create the taxi every 50 sec and add the taxi to the queue
TaxiStand.java:
	-This is the class with main function , it has 10 taxis filled initially.
	-When one taxi leave from taxi stand then it add the taxi from the taxi stand.
	-it will take the passenger and allocate taxi to passenger if taxi is available
	 or else if taxi is not available the it will add the passenger to the queue.
	-When new taxi is added then passenger queue is proccessed effectively.
