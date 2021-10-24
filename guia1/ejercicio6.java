import javax.swing.JOptionPane;
public class ejercicio6 {
    public static void main (String[] args) {
        int base, exponente;
        base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: ")); 
        exponente= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
        int potencia=base;
        for (int n=1; n<exponente; n++) {
            potencia = (potencia*base);
        }
        System.out.println(base + " elevado a " +exponente+ " es: " +potencia);
    } 
}
