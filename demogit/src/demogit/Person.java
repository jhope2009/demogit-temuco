package demogit;

public class Person {
	private String nombre;
	private String apellido;
	private int edad;
	private String sex;
	private Vehicle auto;
	
	public Person(){}
	
	public Person(String nombre){
		this.nombre=nombre;
	}
	
	public Person(String nombre, String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	
}
