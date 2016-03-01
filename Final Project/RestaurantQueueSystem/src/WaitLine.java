


/** Simulates a waiting line. */
public class WaitLine
{	
	private DequeInterface<Customer> line;
    private int numberOfArrivals;
    private int numberServed;
    private int totalTimeWaited;
    public WaitLine ()
    {
    	line = new LinkedQueue<Customer> ();
        reset ();
    } 


    /** Simulates a waiting line with one serving agent.
    @param duration the number of simulated minutes
    @param arrivalProbability a real number between 0 and 1, and the
    probability that a customer arrives at
    a given time
    @param maxTransactionTime the longest transaction time for a
    customer */
    public void simulate (int duration, double arrivalProbability,
            int maxTransactionTime)
    {
        int transactionTimeLeft = 0;
        for (int clock = 0 ; clock < duration ; clock++)
        {
            if (Math.random () < arrivalProbability)
            {
                numberOfArrivals++;
                int transactionTime = (int) (Math.random ()
                        * maxTransactionTime + 1);
                Customer nextArrival = new Customer (clock, transactionTime,
                        numberOfArrivals);
                line.addToBack(nextArrival);
                System.out.println ("Customer " + numberOfArrivals
                        + " enters line at time " + clock
                        + ". Transaction time is "
                        + transactionTime);
            } // end if
            /*  GOing to place customers with reservations to the front of the line
             *  using an if statement that is outside the if statements for checking transactionTime, and enqueuing.
             * if(nextArrival has a reservation)
             * {
             * 		line.addToFront(nextArrival);
             * }
             * else
             * {
             * 	 line.addToBack(nextArrival);
             * }
             */
            
            if (transactionTimeLeft > 0)
                transactionTimeLeft--;
            
            else if (!line.isEmpty ())
            {
            	Customer nextCustomer = line.removeFront();
                transactionTimeLeft = nextCustomer.getTransactionTime () - 1;
                int timeWaited = clock - nextCustomer.getArrivalTime ();
                totalTimeWaited += timeWaited;
                numberServed++;
                System.out.println ("Customer "
                        + nextCustomer.getCustomerNumber ()
                        + " begins service at time " +clock
                        + ". Time waited is " +timeWaited);
            } // end if
        } // end for
    } // end simulate


    /** Displays summary results of the simulation. */
    public void displayResults ()
    {
        System.out.println ();
        System.out.println ("Number served = " + numberServed);
        System.out.println ("Total time waited = " + totalTimeWaited);
        double averageTimeWaited = ((double) totalTimeWaited) /
            numberServed;
        System.out.println ("Average time waited = " + averageTimeWaited);
        int leftInLine = numberOfArrivals - numberServed;
        System.out.println ("Number left in line = " + leftInLine);
    } // end displayResults


    /** Initializes the simulation. */
    public final void reset ()
    {
        line.clear ();
        numberOfArrivals = 0;
        numberServed = 0;
        totalTimeWaited = 0;
    } // end reset
    
} // end WaitLine
