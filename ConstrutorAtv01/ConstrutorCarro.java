package ConstrutorAtv01;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("fzd-2f33",12323);
		Carro carro2 = new Carro("fgs-4k54",45555);
		Carro carro3 = new Carro("jhd-7j77",82440);
		
		System.out.println(carro1.getNumChassi());
		System.out.println(carro1.getPlaca());

		System.out.println(carro2.getNumChassi());
		System.out.println(carro2.getPlaca());

		System.out.println(carro3.getNumChassi());
		System.out.println(carro3.getPlaca());

	}
}