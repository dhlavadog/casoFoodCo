package foodco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Juliana
 */
public class Empresa {
    private Fabrica fabricas[];
    private ArrayList <Campaña> campañas;
    private ArrayList <Cliente> clientes;
    private ArrayList <Producto> productos;
    private Marca marca;

    public Empresa() {
        this.fabricas = new Fabrica[4];
        this.campañas = new ArrayList <Campaña>();
        this.clientes = new ArrayList <Cliente>();
        this.marca = new Marca();
    }
/*
    public void addFabrica(){
    
        this.fabricas.add(this.getFabricas());
    }
    
   public void addCampaña(){
       this.campañas.add(this.getCampaña());
   }
   
    public void addCliente(){
        this.clientes.add(this.getCliente());
    }
    public void addMarca(){
        this.marca.add(this.getMarca());
    }
*/ 
    public ArrayList<Fabrica> getFabricas() {
        return fabricas;
    }

    public void setFabricas(ArrayList<Fabrica> fabricas) {
        this.fabricas = fabricas;
    }

    public ArrayList<Campaña> getCampañas() {
        return campañas;
    }

    public void setCampañas(ArrayList<Campaña> campañas) {
        this.campañas = campañas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
}
