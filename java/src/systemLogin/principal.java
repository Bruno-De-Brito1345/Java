package systemLogin;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileFilter;
import java.io.IOException;

public class principal {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner leitura = new Scanner(System.in);
		String sign ="";
		String user = "Kratimus";
		String password = "F22sola";
		//FileWriter escrita = new FileWriter(user + ".txt");
		
			System.out.println("Qual o seu login?");
			sign = leitura.nextLine();
			
			if(sign.equals(user)) {
				System.out.println("Agora Insira sua senha");
				sign = leitura.nextLine();
					if(sign.equals(password)) {
						System.out.println("Login confirmado");
					}
					else{System.out.println("Seu login está incorreto");}
			}
	}
}
