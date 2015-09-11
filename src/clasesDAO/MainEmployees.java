/**
 * 
 */
package clasesDAO;

import java.util.Iterator;
import java.util.Set;

import Hibernate.Employees;
import services.Employees.Operaciones;
import sessionManager.SessionManager;

/**
 * @author alumno
 *
 */
public class MainEmployees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Para aumentar el salario de los empleados
		Operaciones op = new Operaciones();
		//op.mejor_salario_empleado();
		op.incremento_salario();
		System.out.println("Salario Incrementado");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		
		/*
		//Para obtener una lista de todos los empleados de un departamento
		Operaciones oper = new Operaciones();
		oper.recuperar_empleados_departamentos_id(100);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		*/
		/*	
		//Para obtener el empleado mejor pagado de cada departamento
		Operaciones op1 = new Operaciones();
		Employees emp = new Employees();
		Set<Employees> set_emp = op1.lista_empleados_mejor_pagados();
		Iterator<Employees> it = set_emp.iterator();
		while (it.hasNext()){
			emp = it.next();
			System.out.println("Nombre y Apellido: "+emp.getFirstName()+ " " + emp.getLastName()
					+'\n' + "Sueldo: " + emp.getSalary());
		}
		*/
		SessionManager.cerrar_session_factory();
		
		
		// TODO Auto-generated method stub

	}

}
