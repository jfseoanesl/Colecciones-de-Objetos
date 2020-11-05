/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u7.coleccioens;

import java.util.*;

/**
 *
 * @author jairo
 */
public class Asignatura {
    private String nombre, programa;
    private ArrayList<Alumno>alumnosInscritos;

    public Asignatura(String nombre, String programa) {
        this.nombre = nombre;
        this.programa = programa;
        this.alumnosInscritos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(ArrayList<Alumno> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }

    
    public boolean addAlumno(Alumno a){
        return this.alumnosInscritos.add(a);
    }
    
    public Alumno buscarAlumno(String cod){
        Alumno resultado = null;
        for(Alumno a: this.alumnosInscritos){
            if(a.getCodigo().equalsIgnoreCase(cod)){
                resultado = a;
                break;
            }
        }
        return resultado;
    }
    
    public ArrayList<Alumno> buscarAlumnos(double nota){
         ArrayList<Alumno> resultado = new ArrayList();
         for(Alumno a: this.alumnosInscritos){
             if(a.getnFinal()>=3){
                 resultado.add(a);
             }
         }
         
         return resultado;
    }
    
    public boolean eliminarEstudiante(String cod){
         Iterator<Alumno> it = this.alumnosInscritos.iterator();
         while(it.hasNext()){
             Alumno a = it.next();
             if(a.getCodigo().equalsIgnoreCase(cod)){
                 it.remove();
                 return true;
             }
         }
         return false;
    }
    
    
    
}
