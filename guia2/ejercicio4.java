import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<String>();
        for(int i=0; i<12; i++){
            alumnos.add(JOptionPane.showInputDialog(i +")_Ingrese estudiante: "));
        }
        System.out.println("Lista de alumnos:" +alumnos); 
        List<String> curso1 = alumnos.subList(0, 4); 
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12); 
        System.out.println("Alumnos del curso 1: "+ curso1);
        System.out.println("Alumnos del curso 2: "+ curso2);
        System.out.println("Alumnos del curso 3: "+ curso3);

    }
    
    
}
