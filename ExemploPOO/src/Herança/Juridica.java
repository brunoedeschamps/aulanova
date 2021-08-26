package Herança;

public class Juridica extends Pessoa {
	
		private String cnpj;

		
		public Juridica() {
			
		}
		public Juridica(String cnpj) {
			super();
			this.cnpj = cnpj;
			
		}
		
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		
		
		public void contratar() {
			System.out.println("A empresa " + super.getNome() + " do CNPJ " + this.cnpj + " está contratando!");
		}
		
}
