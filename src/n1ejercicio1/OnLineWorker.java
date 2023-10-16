package n1ejercicio1;

public class OnLineWorker extends Worker {
	private final static double INTERNET = 50d;

	public OnLineWorker(String name, String surName, double priceHour) {
		super(name, surName, priceHour);
	}

	public static double getInternet() {
		return INTERNET;
	}

	@Override
	public double calculateSalary(double hours) {

		double salary = hours * getPriceHour();
		salary += INTERNET;

		return salary;
	}

}
