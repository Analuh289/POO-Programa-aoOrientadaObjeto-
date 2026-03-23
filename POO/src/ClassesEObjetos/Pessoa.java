package ClassesEObjetos;

public class Pessoa {
	//Atributos
		public String nome; 
		public int matricula = 1226;
		public boolean ativo; 
		public Endereco end= new Endereco("", 0, "");
		
		//Construtor
		public Pessoa() {
			super();
			System.out.println("Construiu da Object.");
		}
		
		public Pessoa(String nome, int matricula, Endereco end) {
			super();
			this.nome = nome;
			this.matricula = this.calcularMatricula(matricula);
			this.ativo = true;
			this.end = end;
			System.out.println("Construiu da Pessoa.");
		}



		//Métodos



		public int calcularMatricula(int matricula) {
			return matricula * 10;
		}

		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + 
					", matricula=" + matricula + 
					", ativo=" + ativo + 
					", end=" + end + "]";
		}


		
}
