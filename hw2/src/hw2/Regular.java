package hw2;

public class Regular extends Customer {

	private double tr_promotionLimit = 100;
	private double tr_promotionRate = 0.03;
	private double tr_pointsLimit = 80;
	private double tr_pointsRate = 0.04;

	
	public Regular(String name, int customerID) {
		super(name, customerID);
	}

	//Will benefit from product specific discounts
	//Will benefit from LOWER transaction discounts.
	//Will earn lower points
	
	@Override 
	public double transactionPromotion(double price) {
       return price - (price - tr_promotionLimit)*tr_promotionRate;
	}
	
	@Override
	public void gainPoint(double transactionPromotion) {
		if(transactionPromotion>tr_pointsLimit)
		points += ((transactionPromotion-tr_pointsLimit)*tr_pointsRate);
	else {
		
	}
	}
	
	
}
