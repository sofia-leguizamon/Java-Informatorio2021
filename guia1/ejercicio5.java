import javax.swing.JOptionPane;
public class ejercicio5 {
    public static void main (String[] args) {
        int numero, numero2;
        int suma=0;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: ")); //pide un dato
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero entero: "));

        for (int n=1; n<=numero; n++) {
            suma = suma + numero2;
        }
        JOptionPane.showMessageDialog(null, "la multiplicacion es: " + suma);
    }
}
