import java.util.ArrayList;
import java.util.Collections;

//import jdk.tools.jlink.resources.jlink;
//import javax.swing.JOptionPane;
public class ejercicio3 { 
  public static void main(String[] args) { 
    ArrayList<Character> cartas = new ArrayList<Character>();
    for(int i=0; i<4; i++){
        for(int j=2; j<=10; j++){
            cartas.add(String.valueOf(j).charAt(0)); //convertimos j a string y luego a char
        }
        cartas.add('J');
        cartas.add('Q');
        cartas.add('K');
        cartas.add('A');
        
    }
    cartas.add('p');
    cartas.add('p');
    System.out.println("Baraja de cartas:"+ cartas);
    Collections.reverse(cartas);
    System.out.println("Al reves: "+ cartas);
    Collections.shuffle(cartas);
    System.out.println("Desorden: "+ cartas);


    // 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
   
    
  } 
}
