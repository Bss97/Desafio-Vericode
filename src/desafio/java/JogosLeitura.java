package desafio.java;

import java.io.File;
import java.util.Scanner;

public class JogosLeitura {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("vgsales.csv"));
		scanner.nextLine();
		double soma = 0.0;
		int qte = 0;
		double media = 0.0;
		double desvioPadrao = 0.0;
		double somaDesvio = 0.0;
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			String [] globalSales = linha.split(",");
			double total = Double.parseDouble(globalSales[10]);
			soma += total;
			qte++;
			media = soma / qte;
			desvioPadrao = Math.pow(total - media, 2);
			somaDesvio += desvioPadrao;
			}
		scanner.close();
		System.out.format("Média =  "+ "%.2f",media);
		System.out.format("\nO desvio padrão é = "+ "%.2f", Math.sqrt(somaDesvio / qte));
	}
}
