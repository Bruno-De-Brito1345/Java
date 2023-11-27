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
				
				CheckUserName userChecker = new CheckUserName();
				
				do {
					if(userChecker.checkUserName(conta.getUserName())) {
						System.out.println("Nome de usuário ja está sendo utilizado, por favor escolha outro.");
						dados = info.nextLine();
						conta.setUserName(confirmacao);
					}
				}while(userChecker.checkUserName(conta.getEmail()));
				
				System.out.println("Informe o seu email");
				dados = info.nextLine();
				conta.setEmail(dados);
				
				CheckEmail emailChecker = new CheckEmail();

		        do {
		            if (emailChecker.checkEmail(conta.getEmail())) {
		                System.out.println("Email existente, por favor tente outro");
		                dados = info.nextLine();
		                conta.setEmail(dados);
		            }
		        } while (emailChecker.checkEmail(conta.getEmail()));
				
				System.out.println("Por Favor informe a sua senha: ");
				 dados = info.nextLine();
				 conta.setPrePassword(dados);
				
				System.out.println("Agora Confirme sua senha: ");
				dados = info.nextLine();
				
			    	Boolean teste = false;
				
					while(teste == false){
						if(dados.equals(conta.getPrePassword())){
							
							conta.setPassword(dados);
							break;
							
							}else{
								
								System.out.println("Senha incorreta, digite a confimação novamente");
								dados = info.nextLine();
							}
					}
					
				FileWriter file = new FileWriter("contas/" + conta.getEmail()+".txt");
			    
				lista.add(conta);
				
				file.write(lista.toString());
			    file.close(); 
			    
			    System.out.println("Conta criada com sucesso!!!");
			
		 }
	 }
}
