public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		try {
			f.aumentaSalario(-1);
		} catch (IllegalArgumentException e) {
			System.out.println("Deu erro: " + e.getMessage());
		}
	}
	
}
