package p6_callable2;

import java.util.concurrent.Callable;

public class GPACurveCalculator implements Callable<Double>{
	private double baseGPA;
	private double curveAmount;
	
	public GPACurveCalculator(double baseGpa, double amount) {
		this.baseGPA = baseGpa;
		this.curveAmount = amount;
	}
	

	@Override
	public Double call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(5000);
		return baseGPA + curveAmount;
	}

}
