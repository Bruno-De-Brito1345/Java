package systemLogin;

import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
		var dados = info.next();
		conta.setName(dados);
		lista.add(conta.getName());
		
		System.out.println("Informe seu nome de usário: ");
		dados = info.next();
		conta.setUserName(dados);
		lista.add(conta.getUserName());
		
		System.out.println("Informe o seu email");
		dados = info.next();
		conta.setEmail(dados);
		lista.add(conta.getEmail());
		
		FileWriter file = new FileWriter(conta.getEmail()+".json");
		GsonBuilder gson = new GsonBuilder();
	
		file.write(gson.toJson());
	
	
	    
	}
}
