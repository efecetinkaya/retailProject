package hw2;
public class test {

	public static void main(String[] args) {
		
		Product p = new  Product("kalem", 0.18, 23, null, false, 0.12);
		Gold g = new Gold("g", 423);
		p.calculatePrice(3,g);
		System.out.println(p.getPrice());
		System.out.println(g.transactionPromotion(p.getPrice()));
		
       Transaction.addBasket(p);		
		
		
		
		
		
		
	}

}
