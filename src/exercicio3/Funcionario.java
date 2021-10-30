package exercicio3;

public class Funcionario {
    
	private String nome;
	private int matricula;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void imprimeFuncionario() {
        System.out.println("\n====================================================");
        System.out.println("|             Matricula: " + this.getMatricula() + "                    |");
        System.out.println("|             Nome: " + this.getNome() + "                          |");
        System.out.println("====================================================\n");
        
	}
	
	
}

   
