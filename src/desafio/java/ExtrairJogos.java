package desafio.java;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtrairJogos {

	public static void main(String[] args) throws Exception {
		
		String nome = "";
		String ano = "";
		double vendas = 0.0;
		List<Jogos> nomeJogos = new ArrayList<>();
		
		Scanner scanner = new Scanner(new File("vgsales.csv"), "UTF-8");
		scanner.nextLine();
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String[] col = linha.split(",");
			vendas = Double.parseDouble(col[10]);
			ano = col[3];
			nome = col[1];
			nomeJogos.add(new Jogos(nome , ano, vendas));
		}
		PrintWriter pw = new PrintWriter(new File("nomeDosJogos.txt"));

		for (Jogos jogo : nomeJogos) {
			if (jogo.getAno().length() == 4 && jogo.getVendas() > 2) {
//				System.out.println(jogo.getNome());
				int aposAno = Integer.parseInt(jogo.getAno());
				if (aposAno > 2000) {
					System.out.println("Jogos lançados após o ano de 2000 e que venderam mais de 2 milhões: " + jogo.getNome());
					pw.println(jogo.getNome());
				}
			}
		}
		pw.close();
	}
}
