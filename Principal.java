import java.util.Scanner;

public class Principal{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String check = "Y";
		
		String nome = "Plaucio";
		Pilha<String> pilha = new Pilha<String>(nome);
		
		System.out.println("Olah usuário =D");
		
		while(check.equals("Y")){
			System.out.print("Nome: ");
			nome = sc.next();
			pilha.inserir(nome);
			System.out.println("Continuar?(Y/N)\n");
			check = sc.next();
		}
		
		System.out.println("Listando...\n");
		
		pilha.listar();
		
		System.out.print("\nPalavra a ser deletada: ");
		nome = sc.next();
		pilha.deletar(nome);
		
		pilha.listar();
		
		pilha.pop();
		pilha.listar();
		
	}
	
}