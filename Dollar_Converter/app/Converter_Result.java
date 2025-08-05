package app;

import java.util.Scanner;

import entities.Converter;

public class Converter_Result {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Converter converter = new Converter();
		
		System.out.print("Digite o preço do dólar: R$");
		
		converter.price = sc.nextDouble();
		
		System.out.print("Digite quantos dolares quer comprar: ");
		
		converter.quantity = sc.nextDouble();
		
		System.out.printf("\nValor convertido: R$%.2f", converter.price_brl());
		
		System.out.printf("\nCusto total da conversão: R$%.2f ",converter.total());
		
		sc.close();

	}

}
