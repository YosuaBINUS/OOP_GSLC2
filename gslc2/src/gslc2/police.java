package gslc2;

public class police extends profession implements actions{
	
	public police(String name, int age, int balance) {
		super(name, age, balance);
	}
	
	public void work() {
		balance += 60000;
	}
	public void shop() {
		balance -= 1500;
	}
	public void vacation() {
		balance -= 7000;
	}
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Profession: Police");
		System.out.println("Salary: $60000");
		System.out.println("Current Balance: $" + balance + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
