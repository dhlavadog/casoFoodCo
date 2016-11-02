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
public class Producto 
{
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto(String nombre, int precio, int cantidad) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public int getPrecio() 
    {
        return precio;
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }
    
    public int costoProduccion()
    {
        int total = 0;
        total = this.cantidad*this.precio;
        
        return total;
    }
    
    
    
    
    
    
}
