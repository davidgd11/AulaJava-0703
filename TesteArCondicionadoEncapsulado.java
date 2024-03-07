package br.com.fiap;

import java.util.Scanner;

public class TesteArCondicionadoEncapsulado {
	public static void main(String[] args) {
		
		ArCondicionadoEncapsulado arCond = new ArCondicionadoEncapsulado();
		
		int escolha = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in); 
			System.out.println("Escolha a temperatura e o modo ('Ventilar', 'Aquecer' ou 'Resfriar'): ");
			arCond.setTemperatura(scan.nextInt());
			arCond.setModo(scan.next());
			arCond.mostrar();
			System.out.println("\nFaça sua escolha: "
					  + "\n(1) Definir modo"
					  + "\n(2) Aumentar temperatura"
					  + "\n(3) Diminuir temperatura");
			escolha = scan.nextInt();
			if (escolha == 1){
				System.out.println("Escolha novo modo ('Ventilar', 'Aquecer' ou 'Resfriar')");
				arCond.setModo(scan.next());
			} else if (escolha == 2) {
				System.out.println("Aumentando temperatura...");
				arCond.aumentarTemperatura();;
			} else if (escolha == 3){
				System.out.println("Diminuindo temperatura...");
				arCond.diminuirTemperatura();
			} else {
				System.out.println("Opção incorreta");
			}
			arCond.mostrar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
