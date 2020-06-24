import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.InputMismatchException;
import java.io.*;


public class ileonObjetosMain {
    public static void main(final String[] args) {        
        final Scanner s = new Scanner(System.in);
        int opc = 0;
        double lado = 0;
        boolean salir = false;
        boolean ret= true;
        //System.out.println("ingresa el valor del lado");
        
        
        do
        {
            while(ret)
            {
                try
                {
                    ret = false;
                    System.out.println("ingresa el valor del lado");
                    lado  = s.nextDouble();
                }
                catch (InputMismatchException exception)
                {
                    System.out.println ("El valor debe ser un numero");
                    ret = true;
                    s.nextLine();//Evitar que cicle
                }
            }                        
                        
            System.out.print ("\nIngrese el calculo a realizar (ingresa el numero de opcion):\n");
            System.out.print ("1 Area de cuadrado \n");
            System.out.print ("2 Perimetro de cuadrado\n");
            System.out.print ("3 Volumen de cubo \n");
            System.out.print ("4 Perimetro del cubo\n");
            System.out.println("5 Cancelar\n");                
            System.out.println("6 salir del programa\n");
            opc = comproDatoIngresado(s,1,6);
            s.nextLine();//para limpiar scaner
            if (opc == 5)
            {      
                System.out.println("Nuevamente");          
                ret = true;                
            }
            //ejecOpcSel(opc, s, lado, ret, salir);
            salir  = ejecOpcSel(opc,s,lado,ret, salir);
            //ret = salir;
            //ret = ejecOpcSel(opc,s,lado,ret, salir);            
        }
        while(!salir);        
    }  

    public static boolean ejecOpcSel (int opc,  Scanner s,double lado,boolean go,boolean salir)
    {        
        if (opc==1)
        {
            System.out.println("El valor del lado es "+lado);
            System.out.print ("\n El area de cuadrado es \n");
            cuadrado area = new cuadrado();
            area.calcularArea(lado);                                                       
            
        }
        else if (opc ==2)
        {
            System.out.println("El valor del lado es "+lado);
            System.out.print (" El perimetro de cuadrado es\n");
            cuadrado perimetro = new cuadrado();
            perimetro.calcularPerim(lado);
        }
        else if (opc == 3)
        {
            System.out.println("El valor del lado es "+lado);
            System.out.print (" El volumen de cubo es\n");
            cuadrado volumen = new cuadrado();
            volumen.calcularVolumen(lado);        
        }
        else if (opc ==4)
        {
            System.out.println("El valor del lado es "+lado);
            System.out.print (" Perimetro del cubo\n");
            cuadrado perimetro = new cuadrado();
            perimetro.calcularPerimetroCub(lado);
        }
        /*else if (opc == 5)
        {
            System.out.print ("entro a opcion 5 cancelar\n");
            return  true;
        } */
        else if (opc == 6)
        {
            System.out.print ("Fin de programa, hasta luego\n");
            return salir = true;
        } 
        return salir = false;       
        
    }    
    public static int comproDatoIngresado(final Scanner s, final int min, final int max)
          {
              int val = 0;
              boolean error = false;
              do 
              {
                  error = false;
                  try
                  {
                      val = s.nextInt();
                      if(!((val>=min) && (val<=max)))
                      {                          
                          System.out.println("digito invalido");
                          System.out.println("Tiene que ser entre"+ min +" y "+ max);
                          error = true;                      
                      }
                      
                  }
                  catch (final InputMismatchException e)
                  {
                      System.out.println("la opcion no existe. Se esperaba un numero");
                      error = true;
                      s.nextLine();
                  }
                  catch(final Exception e)
                  {
                      System.out.println("error inesperado." + e);
                      error = true;
                  }
              }
              while(error);
              return val;
    }                    

}
