//FUNCIONARIO

public class Funcionario {
private String nome;
private String cpf;
private double salario;
private double bonificacao;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}

public double getBonificacao() {
	return bonificacao;
}
public void setBonificacao(int ValorAdicional) {
	this.bonificacao = this.salario * 1.10 + ValorAdicional;
}
}
