package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroProduto {
	 Scanner teclado = new Scanner(System.in);	
	public static void main(String[] args) {
		Estoque calculadora = new Estoque();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("ESCOLHA UMA OPÇÃO");
			System.out.println("1:CADASTRO");
			System.out.println("2:IMPRIMIR ESTOQUE");
			System.out.println("3:SAIR");
			
			int valorMenu = in.nextInt();
			

			if (valorMenu == 1) {
				String nomeproduto = JOptionPane.showInputDialog("Informe o nome do Produto");
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe Quantidade"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor"));
				
				calculadora.setNomeproduto(nomeproduto);
				calculadora.setValor1(numero1);
				calculadora.setValor2(numero2);
				calculadora.somar();
				
		
			} else if (valorMenu == 2) {
				System.out.println(calculadora.getResultados());
				
			} else if (valorMenu == 3) {break;
				}
		 else if (valorMenu !=2 ) {
			 System.err.println("INFORME UM DOS 3 NUMEROS");
		}
		}

	}


}