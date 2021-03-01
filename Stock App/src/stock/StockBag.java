package stock;


public class StockBag {
	private Stock[] arr;
	private int nElems;

	public StockBag(int maxSize) {
		arr = new Stock[maxSize];
	}
	
	public void insert(String symbol, double price, double shares) {
		Stock newStock = new Stock(symbol, price, shares);
		arr[nElems++] = newStock;
	}

	public Double getGrandTotal() {
		double grandTotal = 0.0;
		for(int i = 0; i < nElems; i++) {
			grandTotal += arr[i].getTotal();
		}
		
		return grandTotal;
	}

}
