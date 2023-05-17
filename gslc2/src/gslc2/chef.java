package gslc2;

public class chef extends profession implements actions{
	
	public chef(String name, int age, int balance) {
		super(name, age, balance);
	}
	
	public void work() {
		balance += 50000;
	}
	public void shop() {
		balance -= 3000;
	}
	public void vacation() {
		balance -= 12000;
	}
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Profession: Chef");
		System.out.println("Salary: $50000");
		System.out.println("Current Balance: $" + balance + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
