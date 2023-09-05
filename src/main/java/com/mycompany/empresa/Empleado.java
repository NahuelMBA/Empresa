
package com.mycompany.empresa;
public class Empleado {
    
    int dni;
    String nombre,apellido;
    String categoria;
    double sueldo;
    Empresa empresa;

    public Empleado(int dni, String nombre, String apellido, String categoria, double sueldo,Empresa empresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa=empresa;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return this.dni == other.dni;
    }

    @Override
    public String toString() {
        return  nombre + apellido ;
    }

    
    
    
    
}
