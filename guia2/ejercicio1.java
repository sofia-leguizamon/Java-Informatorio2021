import java.util.Scanner;
public class ejercicio1 {
    public static void main (String[] args) {
        System.out.println("Ingrese tres de sus ciudades favoritas");
        String[] ciudades = new String[3]; //el tres indica la cantidad de elemntos
        for (int i=0; i<3; i++ ){
            System.out.println("ciudad:"+ (i+1)+"°");
            Scanner ciudad = new Scanner(System.in); 
            String nombre = ciudad.nextLine();
            ciudades[i]= nombre;  //asi damos valor a los componentes de un array     
            if(i==2){
                ciudad.close();
            }
        } 
        for (int i=0; i<3; i++ ){
        System.out.println("#" +(i+1)+ "-" +ciudades[i]);
        }
        
    }
}