package foodco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliana
 */
public class Personal 
{
    
    private String nombre;
    private String apellido;
    private double salario;
    private int codigo;
    private double horasTrabajo;
    private String categoria;

   
    public Personal() 
    {
        this.nombre = "";
        this.apellido = "";
        this.salario = 0;
        this.codigo = 0;
        this.horasTrabajo = 0;
        this.categoria = "";
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public double getHorasTrabajo() 
    {
        return horasTrabajo;
    }

    public void setHorasTrabajo(double horasTrabajo) 
    {
        this.horasTrabajo = horasTrabajo;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }
    
    
}
