package br.com.engsenai.projeto_area_perimetro_circunferencia;

import java.util.Scanner;

import br.com.engsenai.projeto_area_perimetro_circunferencia.model.Quadrado;
import br.com.engsenai.projeto_area_perimetro_circunferencia.ui.Menu;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		
		String nome = scanner.next();
		
		System.out.println(nome.length());
		System.out.println("Olá," + nome);
		System.out.println(nome.toUpperCase());
		
		
		
		

		Menu menu = new Menu();
		menu.criarMenu();

	}
}
