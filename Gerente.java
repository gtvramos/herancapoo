//GERENTE

public class Gerente extends Funcionario{
	
	private int senhaEspecial = 123;
	private int numerodeFuncionariosGerenciados;
	
	public Gerente(int senha) {
		this.autentica(senha);
	}
	public void autentica(int senha) {
		if (this.senhaEspecial != senha) { 
			System.out.println("Acesso negado");
			System.exit(0);
		}
		else {
			System.out.println("Acesso liberado");
		}
	}
	public int getSenhaEspecial() {
		return senhaEspecial;
	}
	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}
	public int getNumerodeFuncionariosGerenciados() {
		return numerodeFuncionariosGerenciados;
	}
	public void setNumerodeFuncionariosGerenciados(int numerodeFuncionariosGerenciados) {
		this.numerodeFuncionariosGerenciados = numerodeFuncionariosGerenciados;
	}
	
	
}
