
import java.util.Scanner;
public class ejercicio1 {
    public static void main (String[] args) {
        Scanner  entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();  //next solo guarda una palabra, para guardar varias usar nextLine, para un solo caracter .next().charAt(0);
        System.out.println("HOLA: "+nombre +" !!!");  
        entrada.close();
    }
}
/*
esto es un 
comentario de 
varias lineas */