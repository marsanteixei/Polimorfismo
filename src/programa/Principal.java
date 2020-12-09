package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceirizado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc = 0;
		String nome = null;
		Integer horas;
		Double valorpHora;
		Double adicionalDespesa;
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();
		do {

			System.out.println(
					"Qual tipo de funcionario deseja cadastrar? 1- para funcionario da empresa, 2 - para terceirizado, 3 - para imprimir lista de funcionarios (nome e salario) e zero - para sair: ");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("entre com o nome do fucionario");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.println("entre com as horas trabalhadas");
				horas = sc.nextInt();
				System.out.println("entre com o valor por hora de trabalho");
				valorpHora = sc.nextDouble();
				Funcionario func = new Funcionario(nome, horas, valorpHora);
				lista.add(func);
				break;
			case 2:
				sc.nextLine();
				System.out.println("entre com o nome do fucionario");
				nome = sc.nextLine();
				System.out.println("entre com as horas trabalhadas");
				horas = sc.nextInt();
				System.out.println("entre com o valor por hora de trabalho");
				valorpHora = sc.nextDouble();
				System.out.println("entre com o valor da despesa adicional");
				adicionalDespesa = sc.nextDouble();
				Funcionario func2 = new Terceirizado(nome, horas, valorpHora, adicionalDespesa);
				lista.add(func2);
				break;
			case 3:
				for (Funcionario it : lista) {
					System.out.println("nome - " + it.getNome());
					System.out.println(" Salario - R$ " + it.pagamento());

				}
				break;
			default:
				System.out.println("entre com uma opção valida");
			}
		} while (opc != 0);
		System.out.println("---------------fim------------");
		sc.close();
	}

}
