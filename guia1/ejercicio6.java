import javax.swing.JOptionPane;
public class ejercicio6 {
    public static void main (String[] args) {
        int base, exponente, potencia=0;
        base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: ")); 
        exponente= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
        for (int n=1; n<=exponente; n++) {
            potencia = potencia + base;
        }
        System.out.println(base + " elevado a " +exponente+ " es: " +potencia);
    } 
}
