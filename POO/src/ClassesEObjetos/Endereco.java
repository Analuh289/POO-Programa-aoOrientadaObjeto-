package ClassesEObjetos;

public class Endereco {
	//Atributos
		public String logradouro;
		public int numero;
		public String bairro;
		
		//Construtor
		public Endereco(String logradouro, int numero, String bairro) {
			super();
			this.logradouro = logradouro;
			this.numero = numero;
			this.bairro = bairro;
		}

		//Métodos
		@Override
		public String toString() {
			return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + "]";
		}
}
