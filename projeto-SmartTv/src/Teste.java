import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int numeroDigitado=1;
        Scanner scanner= new Scanner(System.in);
        while (numeroDigitado!=0){
            
            System.out.print("Digite um número: ");
            numeroDigitado= scanner.nextInt();

            
            System.out.print(numeroDigitado);
            System.out.print("\n");
            
        }
        scanner.close();

        
    }
}
