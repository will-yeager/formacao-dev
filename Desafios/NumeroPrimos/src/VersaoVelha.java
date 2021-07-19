import java.util.Scanner;

public class VersaoVelha {

    public static void main(String[] args) {

        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        for(int i = 2; i <= num; i++) {
            if(i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println(i);
            }
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            } else {
                System.out.println(i);
            }

        }
    }

}
