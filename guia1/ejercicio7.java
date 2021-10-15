import javax.swing.JOptionPane;
public class ejercicio7 {
    public static void main (String[] args) {
        String palabra= (JOptionPane.showInputDialog("Ingrese una palabra: ")); //pide un dato
        int tamaño= palabra.length(); //da el tamaño de la palabra
        String mayus_pal="";
        for (int n=0; n<tamaño; n++) {
            char letra = (palabra.charAt(n));
            System.out.println("letra: "+letra);
            switch (letra) 
            {
                case 'a':   mayus_pal = mayus_pal + "A" ;
                        break;
                case 'b':  mayus_pal = mayus_pal + "B";
                        break;
                case 'c':  mayus_pal = mayus_pal + "C";
                        break;
                case 'd':  mayus_pal = mayus_pal + "D";
                        break;
                case 'e':  mayus_pal = mayus_pal + "E";
                        break;
                case 'f':  mayus_pal = mayus_pal + "F";
                        break;
                case 'g':  mayus_pal = mayus_pal + "G";
                        break;
                case 'h':  mayus_pal = mayus_pal + "H";
                        break;
                case 'i':  mayus_pal = mayus_pal + "I";
                        break;
                case 'j':  mayus_pal = mayus_pal + "J";
                        break;
                case 'k':  mayus_pal = mayus_pal + "K";
                        break;
                case 'l':  mayus_pal = mayus_pal + "L";
                        break;
                case 'm':  mayus_pal = mayus_pal + "M";
                        break;
                case 'n':  mayus_pal = mayus_pal + "N";
                        break;
                case 'ñ':  mayus_pal = mayus_pal + "Ñ";
                        break;
                case 'o':  mayus_pal = mayus_pal + "O";
                        break;
                case 'p':  mayus_pal = mayus_pal + "P";
                        break;
                case 'q':  mayus_pal = mayus_pal + "K";
                        break;
                case 'r':  mayus_pal = mayus_pal + "R";
                        break;
                case 's':  mayus_pal = mayus_pal + "S";
                        break;
                case 't':  mayus_pal = mayus_pal + "T";
                        break;
                case 'u':  mayus_pal = mayus_pal + "U";
                        break;
                case 'v':  mayus_pal = mayus_pal + "V";
                        break;
                case 'w':  mayus_pal = mayus_pal + "W";
                        break;
                case 'x':  mayus_pal = mayus_pal + "X";
                        break;
                case 'y':  mayus_pal = mayus_pal + "Y";
                        break;
                case 'z':  mayus_pal = mayus_pal + "Z";
                        break;
                default:  mayus_pal = mayus_pal + letra;
                        break;
            }
            
        }
        JOptionPane.showMessageDialog(null, palabra+" en mayuscula: " + mayus_pal); 
    }
}
