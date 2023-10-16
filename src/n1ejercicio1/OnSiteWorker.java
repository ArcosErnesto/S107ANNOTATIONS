package n1ejercicio1;

public class OnSiteWorker extends Worker {
	private static double gasoline = 250d;

	public OnSiteWorker(String name, String surName, double priceHour) {
		super(name, surName, priceHour);
	}

	public static double getGasoline() {
		return gasoline;
	}

	public static void setGasoline(double gasoline) {
		OnSiteWorker.gasoline = gasoline;
	}

	@Override
	public double calculateSalary(double hours) {

		double salary = hours * getPriceHour();
		salary += gasoline;

		return salary;
	}

}
