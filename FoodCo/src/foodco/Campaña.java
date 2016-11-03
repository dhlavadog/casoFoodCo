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
public class Campaña 
{
    private String nombre;
    private String horaTransmision;
    private int costo;

    public Campaña(String a, String hora, int costo ) 
    {
        this.nombre = a;
        this.horaTransmision = hora;
        this.costo = costo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getHoraTransmision() 
    {
        return horaTransmision;
    }

    public void setHoraTransmision(String horaTransmision) 
    {
        this.horaTransmision = horaTransmision;
    }

    public int getCosto() 
    {
        return costo;
    }

    public void setCosto(int costo) 
    {
        this.costo = costo;
    }
    
    
    
    
    
}
