package ConstrutorAtv01;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta("12/04/2025","Sonoda","Dr.Freitas");
		Consulta consulta2 = new Consulta("09/04/3025","Eduarda","Dr. Eduardo");
		Consulta consulta3 = new Consulta("02/04/2025","Eduardo","Dr.Sonoda");
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());

		System.out.println(consulta2.getData());
		System.out.println(consulta2.getNomePcnte());
		System.out.println(consulta2.getNomeDents());


		System.out.println(consulta3.getData());
		System.out.println(consulta3.getNomePcnte());
		System.out.println(consulta3.getNomeDents());
	}
}