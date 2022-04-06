package eedd.Project.business;

import java.util.Date;

public class Profesor {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private Date fecha_nacimiento;
	private String especialidad;
	public String horarioAsignado;
	public int horaEntrada;
	public int horaSalida;
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellidos, String dni, Date fecha_nacimiento, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
		this.especialidad = especialidad;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public float getSalario() {
		float result;
		
		result = 1900;
		return result;
	}

}
