package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyWorker;
import entities.IndividualWorker;
import entities.Worker;

public class MainApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Worker> workerList = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		Integer quantity = sc.nextInt();
		
		for (int i = 1; i <= quantity; i++) {
			
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			Character opt = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			Worker worker;			
			
			if(opt.equals('i')) {
				
				System.out.print("Health expenditures: ");
				Double healthCosts = sc.nextDouble();
				
				worker = new IndividualWorker(name, income, healthCosts);
			} else {
				
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				worker = new CompanyWorker(name, income, numberOfEmployees);
			}
			
			workerList.add(worker);
		}
		
		System.out.println("\nTAXES PAID:");
		
		Double totalTax = 0.0;
		for (Worker worker : workerList) {
			
			System.out.println(worker);
			
			
			totalTax += worker.taxCalculation();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax));
		
		
		sc.close();
	}

}
