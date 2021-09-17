package cartão;

public class Cartao {
	private String nome;
	private int numero;
	private int codigo;
	private int anoValidade;
	private int mesValidade;
	
	public Cartao(String nome, int numero, int codigo, int anoValidade, int mesValidade) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.codigo = codigo;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		System.out.println("Cartão Cadastrado com Sucesso");
	}
	@Override
	public String toString() {
		return "Cartao [nome=" + nome + ", numero=" + numero + ", codigo=" + codigo + ", anoValidade=" + anoValidade
				+ ", mesValidade=" + mesValidade + "]";
	}
	
	
} 

