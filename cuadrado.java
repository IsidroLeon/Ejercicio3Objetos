import java.io.*;
import java.util.*;

public class cuadrado 
{    
        //double area =0;
        
            public void calcularArea(double lado)
            {
                double area  = lado * lado;
                System.out.println(area);                
            }
            public void calcularPerim (double lado)
            {
                double perimetro =lado *= 4;
                System.out.println(perimetro);                
            }

            public void calcularVolumen(double lado)
            {
                cubo volumen = new cubo();
                 volumen.calcularVolumen(lado) ;
                 
            }

            public void calcularPerimetroCub(double lado)
            {
                cubo perimetro = new cubo();
                perimetro.calcularPerimetro(lado);
            }
        
    
    
}