package eedd.Project.business;

import java.util.Date;

public class Administrativo {

	private String nombre;
	private String apellidos;
	private String dni;
	private Date fecha_nacimiento;
	private String categoria;
	public String horarioAsignado;
	public int horaEntrada;
	public int horaSalida;
	
	public Administrativo () {
		super();
	}

	public Administrativo(String nombre, String apellidos, String dni, Date fecha_nacimiento, String categoria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public float getSalario() {
		float result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else 
			result = 1200;
			
		return result;
	}
	
}
