package gslc2;

public abstract class profession {
	
	// This is the abstract class that will extend and be inherited by the 4 jobs
	// In this class there are variable name, age, and start balance, which is need to be declared when creating object of the job classes
	
	String name;
	int age;
	int balance;
	
	public profession() {}
	
	public profession(String name, int age, int balance) {
		this.name = name;
		this.age = age;
		this.balance = balance;
		
	}

	public static void main(String[] args) {

	}

}
