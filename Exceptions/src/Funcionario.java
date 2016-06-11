public class Funcionario {
	private double	salario;
	
	public void aumentaSalario(double aumento) {
		if (aumento < 0) {
			IllegalArgumentException i = new IllegalArgumentException(" aumento negativo [ " + aumento + " ] ");
			throw i;
		}
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
