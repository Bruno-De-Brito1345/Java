package systemLogin;

import java.util.Scanner;
import java.io.IOException;
import java.lang.module.FindException;
import java.nio.CharBuffer;
import java.io.File;



public class Main{
	
	public static void main(String[] args) throws IOException{
	
			var dados= "";			
			Scanner scan = new Scanner(System.in);
	
		    System.out.println("Voce deseja criar sua conta? Se sim, digite 'sim' ou digite 'não' para sair do programa.");
		    dados = scan.nextLine();
		    if(dados.equalsIgnoreCase("sim")) {
			    CriaConta novaConta = new CriaConta(dados);
		   }else {
			   System.out.println("Obrigado por usar o programa tenha um otimo dia");
		   }    
	}
 }
