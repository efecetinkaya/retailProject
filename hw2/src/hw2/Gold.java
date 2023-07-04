package hw2;

public  class Gold extends Customer{

	private double tr_promotionRate  =0.05;
	private double tr_pointsRate = 0.07;
	
	public Gold(String name, int customerID) {
		super(name, customerID);
	}

	//Will benefit from product specific discounts
	//Will benefit from HIGHER transaction discounts.
	//Will earn higher points
	
	@Override 
	public double transactionPromotion(double price) {
		return price*(1-tr_promotionRate);
	}
	
	
	@Override
	public void gainPoint(double transactionPromotion) {
		points += (transactionPromotion*tr_pointsRate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

