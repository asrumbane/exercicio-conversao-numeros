package main;

import java.util.Scanner;

import modelo.ModeloConversao;

public class RomanoDecimal {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Criando uma referencia
	Scanner lerNumero = new Scanner(System.in);
	ModeloConversao mConversao = new ModeloConversao();
			
			//Criando Variaveis
		int numero;

		System.out.print("Insira um numero entre 1 a 9999, em arabe: ");
		numero = lerNumero.nextInt();
		 mConversao.converte(numero);
	}
	}
