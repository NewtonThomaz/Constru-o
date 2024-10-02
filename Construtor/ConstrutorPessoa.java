package Construtor;

public class ConstrutorPessoa {
	public static void main(String[]args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Messi", 36);
		Pessoa pessoa3 = new Pessoa("CR7");
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getIdade());
	}
}