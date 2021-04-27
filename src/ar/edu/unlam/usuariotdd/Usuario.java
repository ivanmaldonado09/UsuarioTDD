package ar.edu.unlam.usuariotdd;

public class Usuario {

	private String password;
	private String usuario;
	private Persona persona;
	public Usuario(String password) {
		
		this.password = password;
	}

	public Usuario(String usuario, String password) {
		this.password = password;
		this.usuario = usuario;
	}
	
	public Usuario(String usuario, String password, String nombre, String apellido, Integer edad) {
		this.password = password;
		this.usuario = usuario;
		this.persona= new Persona(nombre, apellido, edad);
	}

	public Usuario(String usuario, String password, Persona persona) {
		this.password = password;
		this.usuario = usuario;
		this.persona= persona;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Boolean verificarLongitudMayorOIgualAOcho() {
//		if(this.password.length()>=8) {
//			return true;
//		}
//		return false;
//		esto de arriba es lo mismo que lo de abajo
		return this.password.length() >=8;
	}

	public Boolean verificarQueLaContraseniaTengaUnaMayuscula() {
// Recorro la contraseña, metodo estatico dentro de la clase caracter pregunta si hay una mayuscula, si la hay, retorno true, sino false		
		
		for (int i = 0; i < this.password.length(); i++) {
			if(Character.isUpperCase(this.password.charAt(i)))
				return true;
		}
		return false;
	}

	public Boolean verificarQueLaContraseniaTengaUnaMinuscula() {
		for (int i = 0; i < this.password.length(); i++) {
			if(Character.isLowerCase(this.password.charAt(i)))
				return true;
		}
		return false;
	}

	public Boolean esFuerte() {
//		if(this.verificarLongitudMayorOIgualAOcho() && this.verificarQueLaContraseñaTengaUnaMayuscula() && this.verificarQueLaContraseñaTengaUnaMinuscula()) {
//			return true;
//		}
//	return false;
//	Lo de arriba es lo mismo q lo de abajo
	return this.verificarLongitudMayorOIgualAOcho()
			&& this.verificarQueLaContraseniaTengaUnaMayuscula()
			&&this.verificarQueLaContraseniaTengaUnaMinuscula();
	
	}
	

	
	
	
}
