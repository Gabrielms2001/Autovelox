package org.generation.italy;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Viene richiesto all'utente il limite di velocità
		System.out.print("Inserisci il limite di velocità (km/h) da considerare: ");
		int limiteVelocita = sc.nextInt();
		sc.nextLine();

		do {
			// Viene richiesta all'utente la velocità rilevata
			System.out.println("Inserire la velocità rilevata (km/h): ");
			int velocitaRilevata = sc.nextInt();
			sc.nextLine();

			// Calcolo dell'eccesso di velocità rispetto al limite
			int eccessoVelocita = velocitaRilevata - limiteVelocita;

			/*
			 * Si verifica l'importo della multa e le relative sanzioni in base all'eccesso
			 * di velocità
			 */
			if (eccessoVelocita <= 0) {
				System.out.println("Velocità nel limite consentito.");
			} else if (eccessoVelocita <= 10) {
				System.out.println("Eccesso di velocità di " + eccessoVelocita + " km/h");
				System.out.println("E' prevista una sanzione amministrativa compresa tra 42 e 173 euro");
			} else if (eccessoVelocita <= 40) {
				System.out.println("Eccesso di velocità di " + eccessoVelocita + " km/h");
				System.out.println(
						"La multa è compresa tra 173 e 694 euro, in più c'è la sanzione accessoria della perdita di 3 punti della patente");
			} else if (eccessoVelocita <= 60) {
				System.out.println("Eccesso di velocità di " + eccessoVelocita + " km/h");
				System.out.println(
						"La multa oscilla tra 543 e 2.170 euro, in più c'è la sanzione accessoria della perdita di 6 punti della patente");
			} else {
				System.out.println("Eccesso di velocità di " + eccessoVelocita + " km/h");
				System.out.println(
						"La multa varia tra 845 e 3.382 euro, in più ci sono la sospensione della patente di guida da 6 a 12 mesi e la sanzione accessoria della perdita di 10 punti della patente");
			}
			// Si richiede all'utente se vuole inserire un'altra velocità rilevata
			System.out.println("Vuoi inserire un'altra velocità rilevata? (si/no)");
		} while (sc.next().equals("si")); // Il ciclo continua finché l'utente risponde "si"

		System.out.println("Arrivederci!");
		sc.close(); // Chiusura dello scanner
	}
}