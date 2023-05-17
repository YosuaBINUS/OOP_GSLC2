package gslc2;

public interface actions {
	
	// This is the interface that is implemented to the job classes
	// Interfaces are used to make sure the classes that are implemented to have the following methods/variable
	
	//In this interface, the job classes need to have the following method:
	// *work(increase balance according to the jobs)
	// *shop & vacation(different ways to use up the balance, amount is based on profession
	// *showInfo(print the name, age, profession of the object as well as their salary[balance increase amount from method *work] and total balance
	
	public void work();
	public void shop();
	public void vacation();
	public void showInfo();

}
