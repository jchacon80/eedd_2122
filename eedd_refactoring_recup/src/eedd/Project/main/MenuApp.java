package eedd.Project.main;

import java.util.Scanner;

import eedd.Project.business.Administrativo;
import eedd.Project.business.Profesor;
import eedd.Project.business.director;
import eedd.Project.utils.Utils;

public class MenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mostrarPresentacion();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual() );
		System.out.println("/*** " + Utils.hora_actual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
		
		System.out.println("Introduce el n�mero de administrativos : ");
		int numAdmins= sc.nextInt();
		Administrativo[] listaAdmins = new Administrativo[numAdmins];
		for (int i=0; i<numAdmins; i++) {
			listaAdmins[i] = new Administrativo();
			if (i<2) listaAdmins[i].setCategoria("A");
			else listaAdmins[i].setCategoria("B");
			//listaAdmins[i].getSalario();
			System.out.println("El salario del administrativo es: " + listaAdmins[i].getSalario());
		}
		
		System.out.println("Introduce el n�mero de profesores : ");
		int numProf= sc.nextInt();
		Profesor[] listaProf = new Profesor[numProf];
		for (int i=0; i<numProf; i++) {
			listaProf[i] = new Profesor();
			listaProf[i].getSalario();
			System.out.println("El salario del profesor es: " + listaProf[i].getSalario());
		}
		
		calcularSalarioDirector(nombre, primerApellido);
		
		sc.close();
		
	}
	
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     Y DE NUEVO...                                                       ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	private static void calcularSalarioDirector(String n, String a)
	{
		director d = new director();
		d.setNombre(n);
		d.setApellidos(a);
		
		System.out.println("El salario del director es: " + d.getSalario());
	}

}
