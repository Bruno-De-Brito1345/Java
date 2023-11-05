package systemLogin;

import java.util.Scanner;


public class main{
	
	public static void main(String[] args){
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Vamos começar criando sua conta!! Por favor informe seu nome.");
		
		Accounts newUser = new Accounts();
		
		String dados = info.nextLine();
		
		newUser.setName(dados);
		
		System.out.println("Prazer em conehçe-lo(a), " + newUser.getName() + 
				" , agora o senhor poderia informar o seu nome "
				+ "de usuario e em seguida o seu email? ");
		
		dados = info.nextLine();
		
		newUser.setUserName(dados);
		
		System.out.println("Agora o seu email por favor :>.");
		
		dados = info.nextLine();
		
		newUser.setEmail(dados);
		
		System.out.println(newUser.getName()+ ", "  + newUser.getUserName() + ", " + newUser.getEmail());
	}
}
