package systemLogin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckUserName {
	
	private final String diretorio = "contas/";
	
	public boolean checkUserName(String userName) {
		File pasta = new File(diretorio);
		
	    File[] arquivos = pasta.listFiles();
		
		if(arquivos != null) {
		
			for(File arquivo : arquivos) {
				try {
					BufferedReader reader = new BufferedReader(new FileReader(arquivo));
					String linha;
					
					while((linha = reader.readLine()) != null) {
						linha = linha.trim();
						if(linha.startsWith("Usuário:")) {
							String emailExistente = linha.substring("Usuário:".length()).trim();
							if(emailExistente.equals(userName)) {
							   
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
