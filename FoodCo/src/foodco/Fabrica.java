/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;
import java.util.*;

/**
 *
 * @author PC
 */
public class Fabrica 
{
    private String nombre;
    private String tipo;
    private ArrayList <Personal> empleados;
    private ArrayList <Producto> productos;

    public Fabrica(String nombre, String b) 
    {
        this.nombre = nombre;
        this.tipo = b;
        this.empleados = new ArrayList();
        this.productos = new ArrayList();
    }
    
    

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }
    
    

    public ArrayList<Personal> getEmpleados() 
    {
        return empleados;
    }

    public void setEmpleados(ArrayList<Personal> empleados) 
    {
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() 
    {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) 
    {
        this.productos = productos;
    }
    
    public void mostrarEmpleados()

    {
        if(this.empleados.size()>0)
        {
        for(int i = 0; i <this.empleados.size() ; i++)
        {
            System.out.println("══════════════════════════════");
            System.out.println("Nombre: "+this.empleados.get(i).getNombre()+" "+this.empleados.get(i).getApellido());
            System.out.println("Salario: "+this.empleados.get(i).getSalario()+"$");
            System.out.println("Horas Laborales: "+this.empleados.get(i).getHorasTrabajo());
            System.out.println("Area: "+this.empleados.get(i).getCategoria());
           
        }
        }
        
        else System.out.println("No existen empleados");
    }
    
    
    public int salarioTotal()
    {
        int total = 0;
        for(int i = 0; i < this.empleados.size() ; i++)
        {
            total = total + this.empleados.get(i).getSalario();
            
        }
        
        return total;
    }
    
    public int salarioTotalEnlatados()
    {
        int total = 0;
        for(int i = 0; i<this.empleados.size(); i++)
        {
            total = total + this.empleados.get(i).SalarioEnlatados();
        }
        
        return total;
    }
    
    
    public void mostrarProductos ()
    {
        for(int i = 0 ; i<this.productos.size(); i++)
        {
            System.out.println("Nombre: "+this.productos.get(i).getNombre());
            System.out.println("Precio por Unidad: "+this.productos.get(i).getPrecio());
            System.out.println("Cantidad Producida: "+this.productos.get(i).getCantidad());
            System.out.println("══════════════════════════════");
        }
    }
    
    public int costoProductos()
    {
        int total = 0;
        for(int i = 0; i< this.productos.size(); i++)
        {
            total = total + this.productos.get(i).costoProduccion();
        }
        
        return total;
    }
    
    
   
    
    
    
}
