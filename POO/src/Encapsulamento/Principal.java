package Encapsulamento;

public class Principal {

	public static void main(String[] args) {
		//Criar objeto
				Pessoa aluno = new Pessoa();
				aluno.setNome("Pedro");
				//aluno.matricula =  aluno.calcularMatricula(65);
				aluno.end.logradouro = "Rua Cobre";
				System.out.println(aluno);
				
				Endereco endereco = new Endereco("Rua Cobre", 200, "Atlético");
				Pessoa professor = new Pessoa("Amanda", 9874, endereco);
//				Pessoa professor = new Pessoa("Amanda", 9874, 
//											new Endereco("Rua Cobre", 200, "Atlético"));
				professor.matricula = 
						professor.calcularMatricula(professor.matricula);
				System.out.println(professor);
				
	}

}
