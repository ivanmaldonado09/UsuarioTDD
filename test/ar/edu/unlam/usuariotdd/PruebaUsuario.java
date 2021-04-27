package ar.edu.unlam.usuariotdd;

import static org.junit.Assert.*;

import org.junit.Test;




public class PruebaUsuario {

	@Test
	public void verificarQueSePuedaCrearUsuario() {
		Usuario ivan = new Usuario ("Ivan", "abcd1234");
		assertNotNull(ivan);
		
		String valorEsperado= "Ivan";
		String valorObtenido = ivan.getUsuario();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	
	@Test
	public void laContraseñaTieneMasDe8CaracteresDeLongitud() {
	
		Usuario ivan = new Usuario ("Ivan", "abcd1234");
		Boolean verificacionOk = ivan.verificarLongitudMayorOIgualAOcho();
	//Validacion	
		assertTrue(verificacionOk);
		
//		assertTrue(ivan.getPassword().length()>=8);		
	}

	@Test
	public void verificarQueLaContraseniaTengaAlMenosUnaMayuscula() {
		Usuario ivan = new Usuario ("Ivan", "aBcd1234");
		Boolean verificacionOk = ivan.verificarQueLaContraseniaTengaUnaMayuscula();
		//Validacion	
			assertTrue(verificacionOk);
	}
	
	@Test
	public void verificarQueLaContraseniaTengaAlMenosUnaMinuscula() {
		Usuario ivan = new Usuario ("Ivan", "aBcd1234");
		Boolean verificacionOk = ivan.verificarQueLaContraseniaTengaUnaMinuscula();
		//Validacion	
			assertTrue(verificacionOk);
	
	}
	
	@Test
	public void verificarQueLaContraseniaSeaFuerte() {
		
		Usuario ivan = new Usuario ("Ivan", "aBcd1234");
		Boolean verificacionOk = ivan.esFuerte();
		//Validacion	
		assertTrue(verificacionOk);
	}
	
	@Test
	public void queCreeUnUsuarioConLosDatosDeUnaPersonaComposicion() {
		String id = "Ivancitopaa";
		String contrasenia = "Ivan1234";
		String nombre = "Ivan";
		String apellido = "Maldonado";
		Integer edad = 20;
		Usuario usuario = new Usuario (id, contrasenia, nombre, apellido, edad);
		assertNotNull(usuario);
	}
	@Test
	public void queCreeUnUsuarioConLosDatosDeUnaPersonaAgregacion() {
		String id = "Ivancitopaa";
		String contrasenia = "Ivan1234";
		String nombre = "Ivan";
		String apellido = "Maldonado";
		Integer edad = 20;
		
		Persona persona = new Persona (nombre, apellido, edad);
		Usuario usuario = new Usuario (id, contrasenia, persona);
		assertNotNull(usuario);
	}
	
}
