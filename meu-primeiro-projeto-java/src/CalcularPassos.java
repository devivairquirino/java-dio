import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularPassos {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite quantos passos deseja dar: ");
                int quantidadePassos = scanner.nextInt();
                scanner.close();

                for (int i = 1; i <= quantidadePassos; i++) {
                    System.out.println("Passo " + i + "\n");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas valores númericos inteiros!\n");
            }
        }
    }
}