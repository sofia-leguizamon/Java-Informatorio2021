import java.util.*;
import javax.swing.JOptionPane;
public class ejercicio7 {
    public static void main(String[] args) {
        int n1, n2;
        JOptionPane.showMessageDialog(null, "A continuacion ingrese dos numeros, el menor sera el primer parametro de la funcion");
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if (n1<n2){
            System.out.println( "Lista generada: "+numeros(n1,n2));
        }
        else{
            numeros(n2,n1);
        }
    }
    public static List<String> numeros(int a, int b){
        List<String> arreglo_de_numeros = new ArrayList<String>();
        for(int i=a; i<b; i++){
            if (i%2==0 || i%3==0){
                if(i%2==0 & i%3==0){
                        arreglo_de_numeros.add("FizzBuzz");
                }
                else if(i%2==0){
                        arreglo_de_numeros.add("Fizz");
                }
                else if(i%3==0){
                        arreglo_de_numeros.add("Buzz");
                }
            }
            else
                arreglo_de_numeros.add(String.valueOf(i));
        }
        return(arreglo_de_numeros);
    }
}
