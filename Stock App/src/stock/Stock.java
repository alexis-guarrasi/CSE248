package stock;

public class Stock {
	private String symbol;
	private double price;
	private double shares;
	
	public Stock(String symbol, double price, double shares) {
		this.symbol = symbol;
		this.price = price;
		this.shares = shares;
	}

	

	public double getTotal() {
		return price * shares;
	}
}
