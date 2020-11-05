/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u7.coleccioens;

/**
 *
 * @author jairo
 */
public class Alumno {
    private String nombre, apellido, codigo, condicion;
    private char sexo;
    private double nFinal;

    public Alumno(String nombre, String apellido, String codigo, String condicion, char sexo, double nFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.condicion = condicion;
        this.sexo = sexo;
        this.nFinal = nFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getnFinal() {
        return nFinal;
    }

    public void setnFinal(double nFinal) {
        this.nFinal = nFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", codigo=" + codigo + ", condicion=" + condicion + ", sexo=" + sexo + ", nFinal=" + nFinal + '}';
    }
    
    
}
