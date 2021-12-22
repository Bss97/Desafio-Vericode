package desafio.java;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtrairJogos1 {

	public static void main(String[] args) throws Exception {
		
		String nome = "";
		String ano = "";
		double vendas = 0.0;
		
		Scanner scanner = new Scanner(new File("vgsales.csv"), "UTF-8");
		scanner.nextLine();
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String[] col = linha.split(",");
			vendas = Double.parseDouble(col[10]);
			ano = col[3];
			nome = col[1];
		
			if (ano.length()==4 && vendas > 2) {
				int aposAno = Integer.parseInt(ano);
				if(aposAno > 2000) {
					System.out.println("Jogos lançados após o ano de 2000 e que venderam mais de 2 milhões: " + nome);
					PrintWriter pw = new PrintWriter(new File("jogos.txt"));
					pw.println(nome);
					pw.close();
				}
			}
		}
	}
}
