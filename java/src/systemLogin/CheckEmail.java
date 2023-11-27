package systemLogin;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;

public class CheckEmail {
	
	private final String diretorio = "contas/";
	
	public Boolean checkEmail(String email) {
	
				
				File pasta = new File(diretorio);
				
			    File[] arquivos = pasta.listFiles();
				
				if(arquivos != null) {
				
					for(File arquivo : arquivos) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(arquivo));
							String linha;
							
							while((linha = reader.readLine()) != null) {
								linha = linha.trim();
								if(linha.startsWith("Email:")) {
									String emailExistente = linha.substring("Email:".length()).trim();
									if(emailExistente.equalsIgnoreCase(email)) {
									   
										return true;
									}
								}
							}
							
						}catch (IOException e) {
		                    e.printStackTrace();
		                }
					}
			     }
				 
				return false;  
	}	
}
