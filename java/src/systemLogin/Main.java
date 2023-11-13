package systemLogin;

import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.module.FindException;
import java.util.ArrayList;



public class Main{
	
	public static void main(String[] args) throws IOException{
		
				 
		Scanner info = new Scanner(System.in);
		ArrayList lista = new ArrayList<>();
		Accounts conta = new Accounts( );
	
		System.out.println("informe o seu nome: ");
		var dados = info.nextLine();
		conta.setName(dados);
		
		System.out.println("Informe seu nome de usário: ");
		dados = info.nextLine();
		conta.setUserName(dados);
	   
		
		System.out.println("Informe o seu email");
		dados = info.nextLine();
		conta.setEmail(dados);
		
		
		FileWriter file = new FileWriter(conta.getEmail()+".txt");
	    
		lista.add(conta);
		
		file.write(lista.toString());
	    file.close();
	   
	    System.out.println(lista);
	    
	}
}
