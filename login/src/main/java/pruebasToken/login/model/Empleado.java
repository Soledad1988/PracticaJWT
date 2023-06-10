package pruebasToken.login.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Entity(name="Empleado")
@Table(name="empleados")
@Setter
@EqualsAndHashCode(of ="id")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private String edad;
	private String dni;
	private String telefono;
	private String direccion;
	
	public Empleado() {
		
	}
	
	
	public Empleado(Integer id, String nombre, String apellido, String edad, String dni, String telefono,
			String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}


	public Integer getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public String getEdad() {
		return edad;
	}



	public String getDni() {
		return dni;
	}



	public String getTelefono() {
		return telefono;
	}




	public String getDireccion() {
		return direccion;
	}


	
	
	
}
