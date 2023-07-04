package hw2;

public abstract class Customer {
private String name;
private int customerID;
protected double points = 0;


public Customer(String name, int customerID) {
	this.name = name;
	this.customerID = customerID;
}


public abstract double transactionPromotion(double price);

public abstract void gainPoint(double transactionPromotion);





}
