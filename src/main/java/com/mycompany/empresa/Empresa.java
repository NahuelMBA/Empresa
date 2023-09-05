package com.mycompany.empresa;

import java.util.ArrayList;

public class Empresa {

    private String razonSocial;
    private int cuit;
    public static ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    

    public void agregarEmpleado(Empleado e) {

        empleados.add(e);

    }
    
    public String mostrarEmpleados() {

        String mensaje="";
        for (Empleado buscar : empleados) {

            mensaje +=buscar;

        }
        return mensaje;
    }
    
    
    @Override
    public String toString() {
        return razonSocial +" CUIT " +  cuit;
    }
}
