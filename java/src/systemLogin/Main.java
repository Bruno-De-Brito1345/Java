package systemLogin;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.module.FindException;



public class Main{
	
	public static void main(String[] args) throws IOException{
		
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
		
		FileWriter file = new FileWriter(newUser.getUserName() + ".json");
	 
		file.write( String.valueOf(newUser));;
		file.close();
	
	}
}
