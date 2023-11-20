package systemLogin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CriaConta {
	
	Accounts conta = new Accounts();
	
	public CriaConta(String confirmacao) throws IOException {
		 
		 if( confirmacao.equalsIgnoreCase("sim") ) {
			 Scanner info = new Scanner(System.in);
				ArrayList lista = new ArrayList<>();
				Accounts conta = new Accounts();
			
				System.out.println("informe o seu nome: ");
				var dados = info.nextLine();
				conta.setName(dados);
				
				System.out.println("Informe seu nome de usário: ");
				dados = info.nextLine();
				conta.setUserName(dados);
			   
				
				System.out.println("Informe o seu email");
				dados = info.nextLine();
				conta.setEmail(dados);
				
				System.out.println("Por Favor informe a sua senha: ");
				dados = info.nextLine();
				conta.setPassword(dados);
				
				System.out.println("Agora Confirme sua senha: ");
				dados = info.nextLine();
				while(dados.compareTo(conta.getPassword()) {
					System.out.println("Sua senha esta incorreta, porfavor digite a confirmação novamente");
					dados = info.nextLine();
				}
			    
			    
				FileWriter file = new FileWriter("contas/" + conta.getEmail()+".txt");
			    
				lista.add(conta);
				
				file.write(lista.toString());
			    file.close(); 
			
		 }
	 }
	
}
