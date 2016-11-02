/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

/**
 *
 * @author PC
 */
public class Personal 
{
    private String nombre;
    private String apellido;
    private int salario;
    private int horasTrabajo;
    private String categoria;
    private int tarifaPorProduto;
    private int cantidadProducto;

    public Personal(String n, String a,int s, int h, String c, int tp, int cp) 
    {
        this.nombre = n;
        this.apellido = a;
        this.salario = s;
        this.horasTrabajo = h;
        this.categoria = c;
        this.tarifaPorProduto = tp;
        this.cantidadProducto = cp;
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

    public int getSalario() 
    {
        return salario;
    }

    public void setSalario(int salario) 
    {
        this.salario = salario;
    }
   
    public int getHorasTrabajo() 
    {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) 
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
    
    public int SalarioEnlatados()
    {
        int total = 0;
        total = (this.salario*this.horasTrabajo)+(this.tarifaPorProduto*this.cantidadProducto);
        return total;
        
    }
    
    
    
    
    
}
