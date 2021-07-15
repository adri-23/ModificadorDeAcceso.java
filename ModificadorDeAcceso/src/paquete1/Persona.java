package paquete1;

public class Persona {
	//modificador de acceso default, se puede acceder a los atributos
	// y objetos dentro del mismo paquete
	String nombre ="";
	// modificador de acceso privado, se puede acceder solo detro
	// de la misma clase
	private int edad = 0;
	// modificador protected, se puede acceder dentro de la misma clase
	// y del mismo paquete
	protected String domicilio ="";
	//modificador de acceso public, se puede acceder desde la misma clase y 
	// otro paquete
	public float estatura = 0;
	
	
	String saludar() {
		return "hola mi nombre es"+ this.nombre + "mi edad es : "+ this.edad+
		"mi domicilio es: " + this.domicilio + "mi estatura es: " + this.estatura;
		}

}
