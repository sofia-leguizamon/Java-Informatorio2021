import java.util.ArrayList;
import java.util.*;
public class ejercicio5 {
    public static void main(String[] args) {
        List<Integer> hs_trab = new ArrayList<Integer>();
        List<Integer> valor_hs_trab = new ArrayList <Integer>();
        int min = 1;
        int max = 50;
        int minn = 400;
        int maxx = 1500;
        for(int i = 0; i < 5; i++){ 
            Random random = new Random();
            hs_trab.add( random.nextInt(max + min) + min);
            valor_hs_trab.add( random.nextInt(maxx + minn) + minn);
        }
        int total_final=0;
        List<Integer> totales= new ArrayList<Integer>();
        for(int i = 0; i < hs_trab.size(); i++){ 
            totales.add( hs_trab.get(i)*valor_hs_trab.get(i)); //usamos la funcion get para acceder al alemento
            total_final= total_final + totales.get(i);
        }
        System.out.println("hs trabajadas: "+ hs_trab);
        System.out.println("Valor por hora: "+ valor_hs_trab);
        System.out.println("Valor de hs trabajadas: " + totales);
        System.out.println("TOTAL: "+ total_final);

    }   
}

