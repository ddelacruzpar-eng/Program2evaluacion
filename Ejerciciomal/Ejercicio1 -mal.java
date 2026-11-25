import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        boolean sospechosa = false;

        for (int i = 0; i < palabra.length() - 1; i++) {

            if (palabra.charAt(i) == palabra.charAt(i + 1)) {
                System.out.println("La palabra es sospechosa.");
            }
	    else{
                System.out.println("La palabra no es sospechosa.");
            }
        }

         

        sc.close();
    }
}
