package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contributor;
import entities.Individual;
import entities.LegalEntity;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contributor> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("\nTax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			Character ch = sc.next().toLowerCase().charAt(0);

			while (ch != 'i' && ch != 'c') {
				System.out.print("Invalid option, please try again: ");
				ch = sc.next().toLowerCase().charAt(0);
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthSpending));
			} else if (ch == 'c') {
				System.out.print("Number of emplooyees: ");
				int employee = sc.nextInt();

				list.add(new LegalEntity(name, anualIncome, employee));
			}

		}
			System.out.println("\nTAXES PAID:");

			double total = 0.0;

			for (Contributor c : list) {
				System.out.println(c);
				total += c.tax();
			}

			System.out.printf("\nTOTAL TAXES: $ %.2f", total);

		sc.close();
	}

}