
public class Customer
{
	private int clock;
	private int transactionTime;
	private int numOfArrivals;

public Customer(int clock, int transactionTime, int numOfArrivals) 
{
	this.clock = clock;
	this.transactionTime = transactionTime;
	this.numOfArrivals = numOfArrivals;
}

public int getTransactionTime() {
	return transactionTime;
}

public int getArrivalTime() {
	
	return clock;
}

public int getCustomerNumber() {
	
	return numOfArrivals;
}
}

//public class nextCustomer
//{
//	
//}
//
