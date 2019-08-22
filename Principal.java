import java.util.Scanner;

public class Principal{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String check = "Y";
		
		String nome = "Plaucio";
		Pilha<String> pilha = new Pilha<String>(nome);
		
		System.out.println("Olah usuário =D");
		
		pilha.push("Pedro");
		pilha.push("Carlos");

		System.out.println("Top: "+pilha.top());

		for(int i = 0; i < 4; i++){
			System.out.println("Elemento: "+pilha.top());
			pilha.pop();
		}
		
	}
	
}