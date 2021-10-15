import javax.swing.JOptionPane;
public class ejercicio9 {
    public static void main (String[] args) {
        char letra, pal_letra;
        String palabra= (JOptionPane.showInputDialog("Ingrese un string: ")); 
        letra= (JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0));
        int tamaño= palabra.length(), cont=0; 
        for (int n=0; n<tamaño; n++) {
            pal_letra= palabra.charAt(n);
            if ( pal_letra == letra ) 
            {
               cont++ ;
            }
            
        }
        JOptionPane.showMessageDialog(null, "en: '"+palabra+ "' La cantidad de veces que se repite la letra son: " + cont); 
    }
}
