public class Celula<F>{
	private F dado;
	private Celula proximo;
	
	public Celula(F dado){
		this.dado = dado;
		this.proximo = null;
	}
	
	public F getDado(){
		return this.dado;
	}
	
	public Celula getProximo(){
		return this.proximo;
	}
	
	public void setDado(F dado){
		this.dado = dado;
	}
	
	public void setProximo(Celula proximo){
		this.proximo = proximo;
	}
}