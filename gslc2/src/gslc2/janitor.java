package gslc2;

public class janitor extends profession implements actions{
	
	public janitor(String name, int age, int balance) {
		super(name, age, balance);
	}
	
	public void work() {
		balance += 30000;
	}
	public void shop() {
		balance -= 2000;
	}
	public void vacation() {
		balance -= 4000;
	}
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Profession: Janitor");
		System.out.println("Salary: $30000");
		System.out.println("Current Balance: $" + balance + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
