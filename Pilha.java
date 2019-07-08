public class Pilha<E>{
	private Celula<E> inicio;
	
	public Pilha(E elemento){
		inicio = new Celula<E>(elemento);
	}
	
	public Celula pop(){
		Celula<E> velho = inicio;
		inicio = inicio.getProximo();
		
		velho.setProximo(null);
		velho = null;
		
		return inicio;
	}
	
	public void deletar(E palavra){
		
		Celula<E> procurada = buscar(palavra);
		
		Celula<E> atual = procurada.getProximo();
		
		procurada.setProximo(atual.getProximo());
		atual.setProximo(null);
		
		atual = null;
		
	}
	
	public void inserir(E palavra){
		//Inserção no inicio
		Celula<E> novo = new Celula<E>(palavra);
		novo.setProximo(inicio);
		inicio = novo;
	}
	
	public void listar(){
		Celula<E> atual = inicio;
		System.out.println("");
		while(atual != null){
			System.out.println(" "+atual.getDado());
			atual = atual.getProximo();
		}
	}
	
	public Celula buscar(E palavra){
		Celula<E> atual = inicio;
		
		while(!(atual.getProximo().getDado().equals(palavra))){
			atual = atual.getProximo();
		}
		
		return atual;
	}
}