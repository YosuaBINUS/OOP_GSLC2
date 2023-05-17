package gslc2;

public class main {
	
	// This program is about using abstract class and interface together to show the difference between the two.
	// The theme of the program is about different types of jobs and their wages as well as their average spending.
	// There are a total of 4 jobs in this program: doctor, police, chef, and janitor.
	
	// Interface is similar to abstract class> The difference is that all variable declared in it is static and final, therefore it must be declared beforehand. 
	// Variables and methods inside interface are already considered abstract, and doesn't need to use abstract modifier.
	
	// The difference between using abstract class and interface is that you can only extend 1 abstract class, but you implement multiple interfaces.
	// Abstract class is often used to be inherited by classes that are related to the abstract class. For example, an animal abstract class can be inherited by subclasses cat, dog, bird, etc.
	// Interface is often used to be implemented into classes that can be related to each other or not.

	public static void main(String[] args) {
		doctor d1 = new doctor("Felix", 32, 5000000);
		police p1 = new police("Adriel", 36, 2100000);
		chef c1 = new chef("Abdul", 51, 3000000);
		janitor j1 = new janitor("John", 22, 600000);
		
		d1.showInfo(); 
		d1.work(); // doctor + 180000
		d1.shop(); // doctor - 2000
		d1.vacation(); // doctor - 10000
		d1.showInfo(); // profit 168000
		
		p1.showInfo();
		p1.work(); // police + 60000
		p1.shop(); // police - 1500
		p1.vacation(); // police - 7000
		p1.showInfo(); // profit 51500
		
		c1.showInfo();
		c1.work(); // chef + 50000
		c1.shop(); // chef - 3000
		c1.vacation(); // chef - 12000
		c1.showInfo(); // profit 35000
		
		j1.showInfo();
		j1.work(); // janitor + 30000
		j1.shop(); // janitor - 2000
		j1.vacation(); // janitor - 4000
		j1.showInfo(); // profit 24000
	}

}
