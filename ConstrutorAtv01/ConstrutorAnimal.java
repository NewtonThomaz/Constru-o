package ConstrutorAtv01;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal01 = new Animal(324,"preto");
		Animal animal02 = new Animal(124,"marrom");
		Animal animal03 = new Animal(452,"amarelo");
		
		System.out.println(animal01.getTamanho());
		System.out.println(animal01.getCor());
		
		System.out.println(animal02.getTamanho());
		System.out.println(animal02.getCor());
		
		System.out.println(animal03.getTamanho());
		System.out.println(animal03.getCor());
	}
}