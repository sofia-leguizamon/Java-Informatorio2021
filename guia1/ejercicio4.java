import java.util.Scanner;
public class ejercicio4 {
    public static void main (String[] args) {
        int resul_fac=1;
        Scanner reader = new Scanner(System.in);
        int num=0;
        System.out.println("Ingrese numero para que calculemos su factorial: ");
        num = reader.nextInt();

        for (int x=2;x<=num;x++) {
            resul_fac = resul_fac * x;
        }
        System.out.println("F A C T O R I A L: "+ resul_fac);
        reader.close();

    }    
}
