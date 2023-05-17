package gslc2;

public class doctor extends profession implements actions{
	
	public doctor(String name, int age, int balance) {
		super(name, age, balance);
	}
	
	public void work() {
		balance += 180000;
	}
	public void shop() {
		balance -= 2000;
	}
	public void vacation() {
		balance -= 10000;
	}
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Profession: Doctor");
		System.out.println("Salary: $250000");
		System.out.println("Current Balance: $" + balance + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
