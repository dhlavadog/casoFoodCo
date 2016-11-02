/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class FoodCo 
{

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{
  Scanner leer = new Scanner(System.in);
  boolean menu = true;
  int opcion[] = new int[3];
  Empresa foodCo = new Empresa();
  int contadorEmpleados = 0;
      
  while(menu == true)
   {
     System.out.println("*********************");
     System.out.println("FOOD-CO");
     System.out.println("Calidad y Gusto");
     System.out.println("*********************");
   
     System.out.println("1. Gestion de Fabricas");
     System.out.println("2. Clientes");
     System.out.println("3. Campaña");
     System.out.println("4. Salir");
     System.out.print("Seleccione una de las opciones correspodientes: ");
     opcion[0] = leer.nextInt();
    switch(opcion[0])
        {
         case 1 : System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                  System.out.println("1. GESTION DE FABRICAS");
                  System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                  
                  for(int i = 0 ; i<foodCo.getFabricas().size() ; i++)
                    {
                      System.out.println("══════════════════════════════");
                      System.out.println("Nombre: "+foodCo.getFabricas().get(i).getNombre());    
                      System.out.println("Tipo: "+foodCo.getFabricas().get(i).getTipo());
                      System.out.println("Numero de Empleados: "+foodCo.getFabricas().get(i).getEmpleados().size());
                      System.out.println("══════════════════════════════");
                        
                    }
                        
                      System.out.println("1. Empleados");
                      System.out.println("2. Productos");
                      System.out.println("3. Ver costos Totales");
                      System.out.println("4. Volver");
                       
                       
                       opcion[1] = leer.nextInt();
                       switch(opcion[1])
                       {
                           case 1 : System.out.println("══════════════════════════════");
                                    System.out.println("1.1 EMPLEADOS");
                                    System.out.println("══════════════════════════════");
                                    System.out.println("1. Agregar Empleados");
                                    System.out.println("2. Eliminar Empleados");
                                    System.out.println("3. Ver empleados");
                                    System.out.println("4. Ver total de Salarios de Empleados");
                                    System.out.println("5. Volver");
                                    System.out.print("Selecciones una opcion: ");
                                    opcion[2] = leer.nextInt();
                                    switch(opcion[2])
                                    {
                                        case 1 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.1.1. AGREGAR EMPLEADOS \n");
                                                 System.out.println("══════════════════════════════");
                                                 System.out.println("Escriba el nombre de la fabrica a la que va dirigido");
                                                 String nombreFabrica = leer.next();
                                                 for(int i = 0 ; i<foodCo.getFabricas().size() ; i++)
                                                    {
                                                        if(nombreFabrica.equals(foodCo.getFabricas().get(i).getNombre()))
                                                        {
                                                            if(nombreFabrica.equals("BeechField") || nombreFabrica.equals("HomeFarm"))
                                                                {
                                                                    System.out.println("══════════════════════════════");
                                                                    System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                                    System.out.println("Ingrese Nombre de Empleado:");
                                                                    String nombreEmpleado = leer.next();
                                                                    System.out.println("Ingrese Apellido de Empleado:");
                                                                    String apellidoEmpleado = leer.next();
                                                                    int salario = 689454; // Salario por defecto, el minimo.
                                                                    System.out.println("Ingrese numero de horas laborales:");
                                                                    int horasLaborales = leer.nextInt();
                                                                    System.out.println("Escriba una de las Categorias a la que quedará asignado:");
                                                                    System.out.println("Operador de Campo");
                                                                    System.out.println("Mantenimiento");
                                                                    System.out.println("Jardín de mercado");
                                                                    System.out.println("Jardín de hierba");
                                                                    System.out.println("Por favor escriba sin espacios la Categoria");
                                                                    String categoria = leer.next();
                                                                    foodCo.getFabricas().get(i).getEmpleados().add(new Personal(nombreEmpleado, apellidoEmpleado,salario,horasLaborales, categoria,0,0));
                                                                    System.out.println("Nuevo empleado creado");
                                                                }
                                                            else if(nombreFabrica.equals("Coppice") || nombreFabrica.equals("WaterMead"))
                                                                {
                                                                    System.out.println("══════════════════════════════");
                                                                    System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                                    System.out.println("Ingrese Nombre de Empleado");
                                                                    String nombreEmpleado = leer.next();
                                                                    System.out.println("Ingrese Apellido de Empleado");
                                                                    String apellidoEmpleado = leer.next();
                                                                    System.out.println("Ingrese la tarifa acordada por cada producto elaborado");
                                                                    int tarifaProducto = leer.nextInt();
                                                                    System.out.println("Ingrese la cantidad de productos a laborar");
                                                                    int cantidadProducto = leer.nextInt();
                                                                    System.out.println("Ingrese numero de horas laborales");
                                                                    int horasLaborales = leer.nextInt();
                                                                    System.out.println("Ingrese salario por hora acordada");
                                                                    int salarioHora = leer.nextInt();
                                                                    System.out.println("Escriba una de las Categorias a la que quedará asignado:");
                                                                    System.out.println("- Productos no Elaborados");
                                                                    System.out.println("- Unidad de Embotellamiento");
                                                                    System.out.println("- Seccion de Mantenimiento");
                                                                    System.out.println("- Programadores NC");
                                                                    System.out.println("Por favor escriba sin espacios la Categoria");
                                                                    String categoria = leer.next();
                                                                    foodCo.getFabricas().get(i).getEmpleados().add(new Personal(nombreEmpleado, apellidoEmpleado,salarioHora,horasLaborales, categoria,tarifaProducto,cantidadProducto));
                                                                    System.out.println("Nuevo empleado creado");
                                                                    break;
                                                                }
                                                
                                                        }
                                        
                                                        else
                                                        {
                                                            if(i == (foodCo.getFabricas().size())-1) 
                                                            System.out.println("No existe una fabrica con ese nombre");
                                                        }
                                                    }
                                        break;
                           
                                        case 2 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.1.2. ELIMINAR EMPLEADO");
                                                 System.out.println("══════════════════════════════");
                                                 System.out.println("Escriba el nombre de la fabrica a la que pertenece el empleado");
                                                 nombreFabrica = leer.next();
                                                  for(int i = 0 ; i<foodCo.getFabricas().size() ; i++)
                                                  {
                                                      if(foodCo.getFabricas().get(i).getNombre().equals(nombreFabrica))
                                                      {
                                                          System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                          foodCo.getFabricas().get(i).mostrarEmpleados();
                                                          System.out.println("Ingrese nombre de empleado a borrar");
                                                          String nombreEmpleado = leer.next();
                                                          System.out.println("Igrese Apellido de empleado a borrar");
                                                          String apellidoEmpleado = leer.next();
                                                          for( int n = 0 ; n < foodCo.getFabricas().get(i).getEmpleados().size() ; n++)
                                                          {
                                                              if(foodCo.getFabricas().get(i).getEmpleados().get(n).getNombre().equals(nombreEmpleado) && foodCo.getFabricas().get(i).getEmpleados().get(n).getApellido().equals(apellidoEmpleado) )
                                                              {
                                                                  foodCo.getFabricas().get(i).getEmpleados().remove(n);
                                                                  System.out.println("Empleado Eliminado");

                                                              }

                                                              else System.out.println("No existe el empleado");

                                                          }

                                                      }
                                                  }

                                        break;
                           
                                        case 3 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.1.3. VER EMPLEADOS");
                                                 System.out.println("══════════════════════════════");
                                                 for(int i = 0 ; i<foodCo.getFabricas().size(); i++)
                                                 {
                                                     System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                                                     System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                     foodCo.getFabricas().get(i).mostrarEmpleados();

                                                 }
                                        break;

                                        case 4 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.1.4. TOTAL SALARIO DE EMPLEADOS");
                                                 System.out.println("══════════════════════════════");
                                                 for(int i = 0 ; i < 2; i++)
                                                 {
                                                     System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                                                     System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                     System.out.println("Salario Personal: "+foodCo.getFabricas().get(i).salarioTotal()+"$"); 

                                                 }

                                                 for(int i = 2 ; i<4 ; i++)
                                                 {
                                                     System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                                                     System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                     System.out.println("Salario Personal: "+foodCo.getFabricas().get(i).salarioTotalEnlatados()+"$");
                                                 }
                                        break;
                                        case 5 : break;
                                    }
                           break;
                           
                           case 2 : System.out.println("══════════════════════════════");
                                    System.out.println("1.2. PRODUCTOS");
                                    System.out.println("══════════════════════════════");
                                    System.out.println("1. Agregar Producto");
                                    System.out.println("2. Eliminar Producto");
                                    System.out.println("3. Ver productos");
                                    System.out.println("4. Ver costos de Produccion");
                                    System.out.println("5. Volver");
                                    opcion[2] = leer.nextInt();
                                    switch(opcion[2])
                                    {
                                        case 1 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.2.1. AGREGAR PRODUCTO");
                                                 System.out.println("══════════════════════════════");
                                                 System.out.println("Fabricas:");
                                                 for(int i = 0; i< foodCo.getFabricas().size() ; i++)
                                                 {
                                                    System.out.println(foodCo.getFabricas().get(i).getNombre()); 
                                                 }
                                                 
                                                 System.out.println("Ingrese el nombre de la Fabrica que producirá el producto");
                                                 String nombreFabrica = leer.next();
                                                 for(int i = 0; i< foodCo.getFabricas().size() ; i++)
                                                 {
                                                    if(foodCo.getFabricas().get(i).getNombre().equals(nombreFabrica))
                                                    {
                                                        System.out.println("Ingrese nombre del Producto");
                                                        String nombreProducto = leer.next();
                                                        System.out.println("Ingrese el precio por unidad");
                                                        int precioUnidad = leer.nextInt();
                                                        System.out.println("Ingrese la cantidad a producir");
                                                        int cantidadProduccion= leer.nextInt();
                                                        foodCo.getFabricas().get(i).getProductos().add(new Producto(nombreProducto, precioUnidad, cantidadProduccion));
                                                        System.out.println("Producto Creado.");
                                                       
                                                    }
                                                    
                                                    else
                                                    {
                                                        if(i == foodCo.getFabricas().size()-1)
                                                        {
                                                            System.out.println("No existen Fabricas con ese nombre");
                                                        }
                                                        
                                                    }
                                                       
                                                 }
                                        break;
                                        
                                        case 2 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.2.2. ELIMINAR PRODUCTO");
                                                 System.out.println("══════════════════════════════");
                                                 System.out.println("Fabricas: ");
                                                 for(int i = 0; i< foodCo.getFabricas().size() ; i++)
                                                 {
                                                    System.out.println(foodCo.getFabricas().get(i).getNombre()); 
                                                 }
                                                 
                                                 System.out.println("Ingrese el nombre de la Fabrica donde se eliminará el producto");
                                                 nombreFabrica = leer.next();
                                                 for(int i = 0; i< foodCo.getFabricas().size() ; i++)
                                                 {
                                                    if(foodCo.getFabricas().get(i).getNombre().equals(nombreFabrica))
                                                    {
                                                        System.out.println("Ingrese nombre del Producto");
                                                        String nombreProducto = leer.next();
                                                        for(int n = 0; n < foodCo.getFabricas().get(i).getProductos().size(); n++)
                                                        {
                                                               if(foodCo.getFabricas().get(i).getProductos().get(n).getNombre().equals(nombreProducto))
                                                               {
                                                                   System.out.println("Nombre: "+foodCo.getFabricas().get(i).getProductos().get(n).getNombre());
                                                                   System.out.println("Precio por Unidad: "+foodCo.getFabricas().get(i).getProductos().get(n).getPrecio());
                                                                   System.out.println("Cantidad de Produccion: "+foodCo.getFabricas().get(i).getProductos().get(n).getCantidad());
                                                                   System.out.println("Producto eliminado");
                                                                   foodCo.getFabricas().get(i).getProductos().remove(n);
                                                               }
                                                               
                                                               else
                                                               {
                                                                   if(n == foodCo.getFabricas().get(i).getProductos().size()-1)
                                                                   {
                                                                       System.out.println("No existen productos con ese nombre");
                                                                   }
                                                               }
                                                               
                                                        }
                                                     
                                                       
                                                    }
                                                    
                                                    else
                                                    {
                                                        if(i == foodCo.getFabricas().size()-1)
                                                        {
                                                            System.out.println("No existen Fabricas con ese nombre");
                                                        }
                                                        
                                                    }
                                                       
                                                 }
                                        break;
                                        
                                        case 3 : System.out.println("══════════════════════════════");
                                                 System.out.println("1.2.3. VER PRODUCTOS");
                                                 System.out.println("══════════════════════════════");
                                                 for(int i = 0 ; i< foodCo.getFabricas().size(); i++)
                                                 {
                                                     System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                                                     System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                     System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                                                     foodCo.getFabricas().get(i).mostrarProductos();
                                                 }
                                        break;
                                        
                                        case 4:  System.out.println("══════════════════════════════");
                                                 System.out.println("1.2.4. VER COSTOS DE PRODUCCION");
                                                 System.out.println("══════════════════════════════");
                                                 for(int i = 0 ; i< foodCo.getFabricas().size() ; i++)
                                                 {
                                                     System.out.println("══════════════════════════════");
                                                     System.out.println("Fabrica: "+foodCo.getFabricas().get(i).getNombre());
                                                     System.out.println("Costo Produccion"+foodCo.getFabricas().get(i).costoProductos());
                                                     System.out.println("══════════════════════════════");
                                                     
                                                 }
                                                 
                                                 System.out.println("Costo Total de Produccion: "+foodCo.costoTotalProduccion());
                                        break;
                                        
                                        case 5: break;
                                                 
                                                 
                                    }
                           break;
                           
                           case 3: System.out.println("══════════════════════════════");
                                   System.out.println("1.3. VER COSTOS TOTALES");
                                   System.out.println("══════════════════════════════");
                                   int total = 0;
                                   for(int i = 0 ; i < 2; i++)
                                    {            
                                        total = total+foodCo.getFabricas().get(i).salarioTotal(); 
                                    }
                                   for(int i = 2 ; i<4 ; i++)
                                    {
                                        total = total + foodCo.getFabricas().get(i).salarioTotalEnlatados();
                                    }
                                   System.out.println("Salario: "+total);
                                   System.out.println("Costos de Produccion"+foodCo.costoTotalProduccion()+"$");
                           break;
                           
                           case 4 : break;
                           
                           default: System.out.println("Ingrese un valor valido");
                           break;
                                     
                       }
                       
                       
         break;
         case 2 : System.out.println("══════════════════════════════");
                  System.out.println("2. CLIENTES");
                  System.out.println("══════════════════════════════");
                  System.out.println("1. Agregar Cliente");
                  System.out.println("2. Eliminar Cliente");
                  System.out.println("3. Ver clientes actuales");
                  System.out.println("4. Volver");
                  opcion[1] = leer.nextInt();
                  switch(opcion[1])
                  {
                      case 1 : System.out.println("══════════════════════════════");
                               System.out.println("2.1. AGREGAR CLIENTE");
                               System.out.println("══════════════════════════════");
                               System.out.println("Escriba el nombre del nuevo Cliente");
                               foodCo.getClientes().add(new Cliente(leer.next()));
                      break;
                      case 2 : System.out.println("══════════════════════════════");
                               System.out.println("2.2. ELIMINAR CLIENTE");
                               System.out.println("══════════════════════════════");
                               System.out.println("Escriba el nombre del cliente a eliminar");
                               String nombreCliente = leer.next();
                               for(int i = 0 ; i<foodCo.getClientes().size(); i++)
                               {
                                   if(foodCo.getClientes().get(i).getNombre().equals(nombreCliente))
                                   {
                                       System.out.println("Cliente "+foodCo.getClientes().get(i).getNombre()+" eliminado");
                                       foodCo.getClientes().remove(i);
                                       
                                   }
                                   else System.out.println("No existe el Cliente");
                               }
                     break;
                     case 3 :  System.out.println("══════════════════════════════");
                               System.out.println("2.3. VER CLIENTES");
                               System.out.println("══════════════════════════════");
                               
                               for(int i= 0; i<foodCo.getClientes().size(); i++)
                               {
                                   System.out.println(foodCo.getClientes().get(i).getNombre());
                               }
                     break;
                     case 4 : break;
                               
                               
                  }
                  
         break;
         
         case 3 : System.out.println("══════════════════════════════");
                  System.out.println("3. CAMPAÑA");
                  System.out.println("══════════════════════════════");
                  
                               
         default : System.out.println("Ingrese un numero valido");
         break;
                       
        }
           
          
          
      }
        
        
}
    
}
