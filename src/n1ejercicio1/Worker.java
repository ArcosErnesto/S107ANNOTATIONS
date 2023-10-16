package n1ejercicio1;

public class Worker {
	private String name;
	private String surName;
	private double priceHour;

	public Worker(String name, String surName, double priceHour) {
		this.name = name;
		this.surName = surName;
		this.priceHour = priceHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public double getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(double priceHour) {
		this.priceHour = priceHour;
	}

	public double calculateSalary(double hours) {

		double salary = hours * priceHour;

		return salary;
	}

}
