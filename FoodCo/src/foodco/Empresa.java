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
public class Empresa 
{
   
    private ArrayList <Fabrica> fabricas;
    private ArrayList <Campaña> campañas;
    private ArrayList <Cliente> clientes;
    private Marca marca;
    
    public Empresa()
    {
        this.fabricas = new ArrayList <Fabrica>();
        // verduras
        this.fabricas.add(new Fabrica("BeechField","Granja"));
        this.fabricas.add(new Fabrica("HomeFarm","Granja"));
        //enlatados
        this.fabricas.add(new Fabrica("Coppice", "Enlatados"));
        this.fabricas.add(new Fabrica("WaterMead", "Enlatados"));
        this.campañas = new ArrayList<Campaña>();
        this.clientes = new ArrayList<Cliente>();
        this.marca = new Marca();
        //cliente por defecto
        this.clientes.add(new Cliente("TrustMart"));
    }

    public ArrayList<Fabrica> getFabricas() 
    {
        return fabricas;
    }

    public void setFabricas(ArrayList<Fabrica> fabricas) 
    {
        this.fabricas = fabricas;
    }

   

    public ArrayList<Campaña> getCampañas() 
    {
        return campañas;
    }

    public void setCampañas(ArrayList<Campaña> campañas) 
    {
        this.campañas = campañas;
    }

    public ArrayList<Cliente> getClientes() 
    {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) 
    {
        this.clientes = clientes;
    }

    public Marca getMarca() 
    {
        return marca;
    }

    public void setMarca(Marca marca) 
    {
        this.marca = marca;
    }
    
    public int costoTotalProduccion()
    {
        int total = 0;
        for(int i = 0; i<this.fabricas.size() ; i++)
        {
            total = total + this.fabricas.get(i).costoProductos();
            
        }
        return total;
    }
    
    
    
}
