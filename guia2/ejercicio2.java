import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ejercicio2 { 
  public static void main(String[] args) { 
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    for(int i=0; i<5; i++){
        numeros.add( Integer.parseInt(JOptionPane.showInputDialog("ingrese numero ENTERO:" )));
    }
    System.out.println(numeros);
    System.out.println("El tamaño del arreglo de arriba es: "+ numeros.size());
    int num;
    num= Integer.parseInt(JOptionPane.showInputDialog("ingrese el cual sera el nuevo primer elemento de la lista:" ));
    numeros.add(numeros.get(numeros.size()-1));  //movemos el ultimo elemento una casilla mas
    for(int j=4; j>0; j-- ){
        numeros.set(j, numeros.get(j-1)); //movemos el cada elemento anterior hacia el siguiente
    }
    numeros.set(0, num); //insertamos el nuevo primer elemento
    num= Integer.parseInt(JOptionPane.showInputDialog("ingrese el cual sera el nuevo ultimo elemento de la lista:" ));
    numeros.add(num);  //insertamos el nuevo ultimo elemto
    System.out.println(numeros);  
    System.out.println("El tamaño del arreglo de arriba es: "+ numeros.size());  //mostramos el nuevo tamaño
    
  } 
}
