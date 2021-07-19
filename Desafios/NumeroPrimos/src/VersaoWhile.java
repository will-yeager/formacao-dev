import java.util.Scanner;

public class VersaoWhile {

    public static void main(String[] args) {
        int numeroDigitado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numeroDigitado = entrada.nextInt();

        while(numeroDigitado < 0) {
            for (int divisor = 2; divisor <= numeroDigitado; divisor++) {
                if (numeroDigitado % divisor == 0 && numeroDigitado != divisor) {
                    break;
                } System.out.println(numeroDigitado);
                break;
            }
            numeroDigitado--;
        }
    }
}
