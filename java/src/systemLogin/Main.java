package systemLogin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner info = new Scanner(System.in);

		System.out.println("Seja bem vindo, por favor crie uma conta para prosseguir");

		String novo = info.nextLine();

		Logins novoLogin = new Logins();

		System.out.println("Vamos começar pelo seu nome");

		novo = info.nextLine();

		novoLogin.setName(novo);

		System.out.println(novoLogin.getName());


	}
 }
