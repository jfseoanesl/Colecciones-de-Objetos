/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u7.coleccioens;

import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class TestAsignatura {
    public static void main(String arg[]){
    
        Asignatura POO = new Asignatura("Programacion II", "Ing. Sistemas");
        Alumno e1 = new Alumno("luis", "diaz", "123", "Regular", 'M', 4);
        Alumno e2 = new Alumno("jose", "diaz", "345", "Regular", 'M', 2);
        Alumno e3 = new Alumno("Marcos", "ortiz", "456", "Condicional", 'M', 5);
       
        if(POO.addAlumno(e1)){
            System.out.println("Alumno 1 registrado cone exito");
        }
        else{
            System.out.println("Error al registrar alumno 1");
        }
        POO.addAlumno(e2);
        POO.addAlumno(e3);
        
        imprimirListaEstudiante(POO.getAlumnosInscritos());
        
        System.out.println("Resultado busqueda alumno 456: ");
        Alumno busca = POO.buscarAlumno("456");
        if(busca!=null){
            System.out.println(busca);
        }
        else{
            System.out.println("EL alumno no esta registrado");
            
        }
        System.out.println("----------------------\n");
        
        System.out.println("Resultado busqueda alumnos con nota > 3: ");
        ArrayList<Alumno> encontrados = POO.buscarAlumnos(3);
        imprimirListaEstudiante(encontrados);
        
        System.out.println("Resultado eliminara alumno 456: ");
        if(POO.eliminarEstudiante("456")){
            System.out.println("Estudiante eliminado exitosamente");
        }
        else{
            System.out.println("EL alumno no esta registrado y no se puede eliminar");
        }
        System.out.println("----------------------\n");
        
       imprimirListaEstudiante(POO.getAlumnosInscritos()); 
    }
    
    public static void imprimirListaEstudiante(ArrayList<Alumno> lista){
        System.out.println("\nLista de estudiantes: ");
        for(Alumno a: lista){
            imprimirEstudiante(a);
        }
        System.out.println("--------------------\n");
    }
    
    public static void imprimirEstudiante(Alumno a){
        System.out.println(a);
    }
}
