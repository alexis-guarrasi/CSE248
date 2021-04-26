package p3_inheritance;

public abstract class Beverage {
	private String description;
	private String milk;
	private String mocha;
	private String soy;
	private String whip;
	
	private double cost;
	
	public double getCost() {
		return cost; // add up all the cost of the condiments
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getMocha() {
		return mocha;
	}

	public void setMocha(String mocha) {
		this.mocha = mocha;
	}

	public String getSoy() {
		return soy;
	}

	public void setSoy(String soy) {
		this.soy = soy;
	}

	public String getWhip() {
		return whip;
	}

	public void setWhip(String whip) {
		this.whip = whip;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
