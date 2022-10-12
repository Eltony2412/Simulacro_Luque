import java.util.Scanner;
public class preg02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para separar: ");
        int numero = sc.nextInt();
        int tamaño = Integer.toString(numero).length();

        for (int i=0; i < tamaño; i++){
            String digito = String.valueOf(Integer.toString(numero).charAt(i));
            System.out.println(digito);
        }
    }
}
