public class Pilha<E>{
	private Celula<E> top;
	
	public Pilha(E elemento){
		top = new Celula<E>(elemento);
	}
	
	public E pop(){

		if(top == null){
			throw new EPilhaVazia("pop() -> A pilha está vazia!");
		}

		Celula<E> velho = top;
		top = top.getProximo();
		
		velho.setProximo(null);
		
		return velho.getDado();
	}
	

	public E top(){
		if(top == null){
			throw new EPilhaVazia("top() -> A pilha está vazia!");
		}

		return this.top.getDado();
	}
	
	public void push(E palavra){
		Celula<E> novo = new Celula<E>(palavra);
		novo.setProximo(top);
		top = novo;
	}
	
	public void listar(){
		Celula<E> atual = top;
		System.out.println("");
		while(atual != null){
			System.out.println(" "+atual.getDado());
			atual = atual.getProximo();
		}
	}
	
	public Celula buscar(E palavra){
		Celula<E> atual = top;
		
		while(!(atual.getProximo().getDado().equals(palavra))){
			atual = atual.getProximo();
		}
		
		return atual;
	}
}