package p6_callable;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
	private int number;
	
	public FactorialTask(int number) {
		this.number = number;
	}
	

	@Override
	public Integer call() throws InvalidParameterException {
		int factorial = 1;
		
		if(number < 0) {
			throw new InvalidParameterException("Number must be positive.");
		}
		
		for(int count = number; count > 1; count--) {
			factorial = factorial * count;
		}
		
		return factorial;
	}

	class InvalidParameterException extends Exception {
		public InvalidParameterException(String message) {
			super(message);
		}
	}
}
