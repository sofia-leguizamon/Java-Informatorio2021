import javax.swing.JOptionPane;
public class ejercicio3 {
    public static void main (String[] args) {
        int i=1;
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); //pide un dato
        System.out.println("hola, empezamos: ");
        while (i<=numero){
            int j=1;
            System.out.print(j);
            while (j<i){
                j++;
                System.out.print(j); 
            }
            System.out.println(""); //el println realiza un salto de linea
            i += 1;
        }
            
            
    }
}
