import java.util.Scanner;
public class QueueSimulation {
	
	
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the Duration for the Simulation");
	int i1 = sc.nextInt();
	System.out.println("Please enter the Arrival Probability for the Simulation");
	double i2 = sc.nextDouble();
	System.out.println("Please enter the Maximum Transaction Time for the Simulation");
	int i3 = sc.nextInt();
	// Going to create a GUI to ask user for inputs regarding duration of simulation, arrival probability, and max Transaction Time!
	// using JFrame class and using textboxes to gather input data.
	WaitLine customerLine = new WaitLine();
	
	customerLine.simulate(i1, i2, i3);
	customerLine.displayResults();
}

}