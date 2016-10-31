/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;
import java.util.*;

/**
 *
 * @author Juliana
 */
public class FoodCo {

    public static void main(String[] args) 
    {
        Fabrica f1 = new Fabrica();
        Fabrica f2 = new Fabrica();
        Fabrica f3 = new Fabrica();
        Fabrica f4 = new Fabrica();
        
        int opcion[]= new int [5];
        boolean menu = true;
        while(menu==true ){
        System.out.println("FOOD-CO\n");
        System.out.println("1. Personal");
        System.out.println("2. Cliente");
        System.out.println("3. Campaña");
        System.out.println("4. Fabrica");
        System.out.println("5. Marca");
        System.out.print("Ingrese uno de los numeros correspondientes a las opciones:");
        Scanner leer = new Scanner(System.in);
        opcion[0] = leer.nextInt();
        System.out.println("");
        
        switch(opcion[0])
        {
            case 1: System.out.println("PERSONAL");
                    System.out.println("1. Agregar personal ");
                    System.out.println("2. Eliminar personal ");
                    System.out.println("3. Revisar Personal");
                    System.out.println("4. Mostrar numero de trabajadores ");
                    System.out.print("Ingrese uno de los numeros correspondientes a las opciones:  ");
                    opcion[1] = leer.nextInt();
                    System.out.println("");
                    switch(opcion[1])
                    {
                        case 1 : 
                                 System.out.println("AGREGAR PERSONAL");
                                 System.out.println("¿A qué fabrica se va a asignar el empleado?");
                                 System.out.println("Ingrese nombre: ");
                                 System.out.println("Ingrese apellido: ");
                                 System.out.println("Ingrese codigo: ");
                                 System.out.println("Ingrese numero de horas de trabajo: ");
                                 System.out.println("Ingrese categoria: ");
                                 break;
                        case 2 : 
                        case 3 :
                        case 4 :
                    }
                    break;
                    
            case 2: System.out.println("CLIENTE");
                    System.out.println("1. Agregar cliente");
                    System.out.println("2. Eliminar cliente");
                    System.out.println("3. Modificar cliente");
                    System.out.println("4. Mostrar clientes");                   
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    opcion[2] = leer.nextInt();
                    System.out.println("");
                    switch(opcion[1])
                    {
                        case 1 : System.out.println("AGREGAR CLIENTE");
                                 System.out.println("Ingrese nombre: ");                                
                                 System.out.println("Ingrese codigo: ");
                                 break;
                        case 2 :
                        case 3 :
                        case 4 :
                    }
                    break;
                    
            case 3: System.out.println("CAMPAÑA");
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    System.out.println("1. Agregar campaña");
                    System.out.println("2. Eliminar campaña");
                    System.out.println("3. Mostrar campañas");
                    opcion[3] = leer.nextInt();
                    switch(opcion[1])
                    {
                        case 1 : System.out.println("AGREGAR CAMPAÑA");
                                 System.out.println("Ingrese nombre: ");                                
                                 System.out.println("Ingrese horas de transmision: ");
                                 System.out.println("Ingrese costo de campaña");
                        case 2 :
                        case 3 :
                    }
                    break;
            case 4: System.out.println("FABRICA");
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    System.out.println("1. Agregar fabrica");
                    System.out.println("2. Agregar productos a una fabrica");
                    System.out.println("3. Eliminar fabrica ");
                    System.out.println("4. Eliminar producto");
                    opcion[4] = leer.nextInt();
                    switch(opcion[1])
                    {
                        case 1 : 
                        case 2 :    
                        case 3 :    
                        case 4 :    
                            
                    }
                    break;
                    
            default : System.out.println("Ingrese un valor valido");
        }
       
    }
    
}}
