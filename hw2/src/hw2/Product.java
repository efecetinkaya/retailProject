package hw2;

public class Product {
   private String name;
   private double price;
   private String type;
   private boolean isLuxury;
   private double productPromotion;
   private double tax;
   
   public Product( String name,double tax, double price, String type, boolean isLuxury, double productPromotion) {
	   this.name = name;
	   this.price = price;
	   this.productPromotion = productPromotion;
	   this.type = type;
	   this.isLuxury = isLuxury;
	   this.tax = tax;
}
      public double getPrice() {
	   if(isLuxury == true) {
		   return price + (price/2);
	   }else {
		   return price;
	   }   }
	
	
	public void calculatePrice(double count, Customer c) {
	price = count*( price * (1+tax)*(1-productPromotion));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
