package ejercicio6;
import java.util.*;
public class calcular_sueldo {
    public static void main(String[] args) {
        
        Set<Empleados> empleado= new HashSet<Empleados>(); 
        Empleados e1=new Empleados("Luis Sosa", "40678987", 36, 300 );
        Empleados e2=new Empleados("Maria Martinez", "57678934", 53, 254 );
        Empleados e3=new Empleados("Jose Enrique", "396789865", 66, 397 ); 
        empleado.add(e1); //añadimos elementos a la coleccion
        empleado.add(e2);
        empleado.add(e3);
    
         System.out.println(empleado);

         HashMap<String, Integer> valores= new HashMap<String, Integer>(); 

         //para introducir al mapa:
        for (Empleados i: empleado) {
            valores.put(i.getDni() , i.getHs_trab() * i.getValor_hs_trab());
        }
        System.out.println(valores);
    }
}