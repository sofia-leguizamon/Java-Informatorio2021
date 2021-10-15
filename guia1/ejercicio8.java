import javax.swing.JOptionPane;
public class ejercicio8 {
    public static void main (String[] args) {
       int edad;
       String nombre= (JOptionPane.showInputDialog("Ingrese su nombre Y apellido: ")); //pide un dato STRING
       edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
       String direccion= (JOptionPane.showInputDialog("Ingrese su direccion: ")); 
       String ciudad= (JOptionPane.showInputDialog("Ingrese ciudad: "));
       System.out.print("{" +ciudad+ "} - {"+direccion+"} - {"+edad+"} - {" +nombre+"}"); 

    }
}

