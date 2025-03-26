package br.com.engsenai.projeto_area_perimetro_circunferencia.ui;

import java.util.Scanner;

import br.com.engsenai.projeto_area_perimetro_circunferencia.model.Quadrado;

public class Menu {
	public void criarMenu() {

		System.out.println("-----------------------------");
		System.out.println("CALCULADOR DE POLÍGONOS");
		System.out.println("-----------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Triângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Retângulo");
		System.out.println("5 - Circuferência");
		System.out.println("6 - Sair");
		System.out.println("-----------------------------");
		System.out.println("6 - Escolha uma opção (1 - 6):");
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		System.out.println("A opção selecionada foi : " + opcao);
		
		

	}

}
