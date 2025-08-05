package entities;

public class Converter {
	
	public double price;
	public double quantity;
	public double percentage = 0.06;
	
	public double price_brl() {
		return (price * quantity);
	}

	public double total() {
		return (percentage * price_brl() + price_brl());
				
	}
	
}
		

