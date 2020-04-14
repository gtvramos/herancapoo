//***********************************
//NomeAluno: Gustavo Ramos matricula: 0050012981
//************************************
//Tester
import java.util.Scanner;
public class Tester {
	
	
	public static void main(String[] args) {
		//Gerente
	Scanner input = new Scanner(System.in);
	System.out.println("Entre com a sua senha:");
	int senha= input.nextInt();
	Gerente ge = new Gerente(senha);
	
--->	System.out.println("Entre com o nome do gerente:");
	ge.setNome(input.nextLine());
	
--->	System.out.println("Entre com o CPF do gerente:");
	ge.setCpf(input.nextLine());
	
	System.out.println("Entre com o salario:");
	ge.setSalario(input.nextDouble());
	
	
	ge.setBonificacao(1000);
	
	System.out.println("Entre com o numero de funcionarios gerenciados:");
	ge.setNumerodeFuncionariosGerenciados(input.nextInt());
	
	//Funcionario
	Funcionario func = new Funcionario();
--->	System.out.println("Entre com o nome do funcionario:");
	func.setNome(input.nextLine());
	
--->	System.out.println("Entre com o CPF do funcionario:");
	func.setCpf(input.nextLine());
	
	System.out.println("Entre com o salario:");
	func.setSalario(input.nextDouble());
	func.setBonificacao(0);
	
	System.out.println(ge.getNome());
	System.out.println(ge.getCpf());
	System.out.println(ge.getSalario());
	System.out.println(ge.getBonificacao());
	System.out.println(ge.getNumerodeFuncionariosGerenciados());
	
}
	
}
