import java.util.Scanner;

public class VersaoFor {

    public static void main(String[] args) {

        int numeroDigitado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numeroDigitado = entrada.nextInt();

        for(int primo = numeroDigitado; primo > 0; primo--) {
            for (int divisor = 2; divisor <= primo; divisor++) {
                if (primo % divisor == 0 && primo != divisor) {
                    break;
                } System.out.println(primo);
                    break;
            }
        }
    }
}
