import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main (String[] args) {
    int numero, numero2;
    numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); //pide un dato
    numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
    JOptionPane.showMessageDialog(null, "La suma de los dos numero es: " + (numero+numero2)); //te devuelve un mensaje
    JOptionPane.showMessageDialog(null, "La suma de los dos numero es: " + (numero-numero2));
    JOptionPane.showMessageDialog(null, "La suma de los dos numero es: " + (numero*numero2));
    JOptionPane.showMessageDialog(null, "La suma de los dos numero es: " + (numero/numero2));
    JOptionPane.showMessageDialog(null, "La suma de los dos numero es: " + (numero%numero2));
        
        
    }
}
