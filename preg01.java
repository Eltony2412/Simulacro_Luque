import java.util.Scanner;
public class preg01 {

    static double operacion(int n){
        double resultado=0;
        for (int i=1; i<n+1; i++){
            resultado += 1 / ((double)(i+3) * (double)(i+4));
        }


        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce valor de n: ");
        int n = sc.nextInt();

        System.out.println(operacion(n));
    }
}