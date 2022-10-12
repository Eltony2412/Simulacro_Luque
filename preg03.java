import java.util.Scanner;

public class preg03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero = sc.nextInt();

        int resto, falto=numero, numInvertido=0;

        while (falto>0){

            resto = falto % 10;
            falto = falto / 10;
            numInvertido = (numInvertido * 10) + resto;

        }

        if (numInvertido == numero){
            System.out.println("Es capicúa");
        }else {
            System.out.println("No es capicúa");
        }

    }
}