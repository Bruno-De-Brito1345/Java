package systemLogin;



public class Accounts{

	 private String name;
	 private String userName;
	 private String email;
	 private String password;
	 private String prePassword;

	public String getPrePassword() {
		return prePassword;
	}

	public void setPrePassword(String prePassword) {
		this.prePassword = prePassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "\n Nome: " + name + "\n Usuário: "+ userName + "\n Email: "
				+ email + "\n Senha: "+ password +"\n";
		
	}
}
