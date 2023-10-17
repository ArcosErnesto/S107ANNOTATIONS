package n1ejercicio1;

import java.util.ArrayList;

public class MainEx1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		double hours = 176;
		ArrayList<Worker> workers = new ArrayList<Worker>();
		OnSiteWorker worker1 = new OnSiteWorker("Eugenio", "Chacón", 25);
		OnLineWorker worker2 = new OnLineWorker("Petronila", "Baquedano", 27);
		OnSiteWorker worker3 = new OnSiteWorker("Angustias", "Rebollo", 19);
		OnLineWorker worker4 = new OnLineWorker("Segismundo", "Avellanedo", 22);

		workers.add(worker1);
		workers.add(worker2);
		workers.add(worker3);
		workers.add(worker4);

		for (Worker worker : workers) {
			if ((worker instanceof OnSiteWorker)) {
				System.out.println("Nombre: " + worker.getName() + ", apellido: " + worker.getSurName()
						+ ", salario mensual: " + worker.calculateSalary(hours) + ". Trabajador presencial.");
			} else if ((worker instanceof OnLineWorker)) {
				System.out.println("Nombre: " + worker.getName() + ", apellido: " + worker.getSurName()
						+ ", salario mensual: " + worker.calculateSalary(hours) + ". Trabajador OnLine.");
			}
		}

	}

}
