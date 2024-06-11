package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Act;
import entities.Senha;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Senha> registros = new ArrayList<>();
		// Método que ja adiciona alguns objetos ao sistema.
		préRegistros(registros);
		while (true) {
			Act.exibirMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha

			switch (choice) {
			case 1:
				Act.register(registros);
				break;
			case 2:

				Act.printList(registros);
				break;
			case 3:
				Act.sort(registros);
				break;
			case 4:
				System.out.println("Saindo...");
				scanner.close();
				return;

			default:
				System.out.println("\nOpção inválida. Tente novamente.");
			}
		}

	}

	public static void préRegistros(ArrayList<Senha> registros) {
		Senha email = new Senha("Email", "Email@1234");
		Senha social = new Senha("Social Media", "Soc1alM3d!a");
		Senha stream = new Senha("Streaming", "Stream!ng2022");
		Senha commerce = new Senha("E-commerce", "Ecom#2023");
		Senha bank = new Senha("Bank", "B@nk12345");

		registros.add(email);
		registros.add(social);
		registros.add(stream);
		registros.add(commerce);
		registros.add(bank);

	}

}
