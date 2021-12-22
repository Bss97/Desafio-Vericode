package desafio.java;

public class Jogos {

	private String nome;
	private String ano;
	private double vendas;
	
	public Jogos(String nome, String ano, double vendas) {
		this.nome = nome;
		this.ano = ano;
		this.vendas = vendas;
	}
	
	public String getNome() {
		return nome;
	}
	public String getAno() {
		return ano;
	}
	
	public double getVendas() {
		return vendas;
	}
}
