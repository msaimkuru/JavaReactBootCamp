package interfaceAbstractDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concretes.CustomerCheckManager;
import interfaceAbstractDemo.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {
	public static void main(String[] args) throws Exception {
		// 4 KPS fields will be taken on console from the user.
		String firstName;
		String lastName;
		String dateOfBirthString;
		String nationalId;

		// dateOfBirthString will be stored into this LocalDate variable.
		LocalDate dateOfBirth;

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		System.out.println("Ad:");
		firstName = myObj.nextLine();

		System.out.println("Soyad:");
		lastName = myObj.nextLine();

		System.out.println("Doğum Tarihi(dd.mm.yyyy formatında):");
		dateOfBirthString = myObj.nextLine();
		dateOfBirth = LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

		System.out.println("TC Kimlik No:");
		nationalId = myObj.nextLine();

		/*
		 * KPS (MERNIS) service adapter is composed in a StarbucksCustomerManager
		 * object. With this object referenced by a BaseCustomerManager reference we
		 * save a customer only if KPS validation succeeds.
		 */
		MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(mernisServiceAdapter);
		baseCustomerManager.save(new Customer(1, firstName, lastName, dateOfBirth, nationalId));
	}
}