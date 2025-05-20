import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        SmartTv smartTv= new SmartTv();
        //Comandos volume e canal so funcionam se a tv estiver ligada
        // smartTv.aumentarVolume();
        // smartTv.mudarCanal(9);
        // smartTv.ligarTv();
        // smartTv.mostrarStatusSmartTv();
        // smartTv.aumentarVolume();
        // smartTv.diminuirVolume();
        // smartTv.aumentarCanal();
        // smartTv.aumentarCanal();
        // smartTv.diminuirCanal();
        // smartTv.mudarCanal(24);
        // smartTv.mostrarStatusSmartTv();

        int numeroDigitado=1;
        // finaliza o programa quando 0 for digitado
        while(numeroDigitado!=0){
            mostrarMenu();
            numeroDigitado= scanner.nextInt();
            switch (numeroDigitado) {
                case 1:
                    smartTv.ligarTv();
                    break;
                case 2:
                    smartTv.desligarTv();
                    break;
                case 3:
                    smartTv.aumentarVolume();
                    break;
                case 4:
                    smartTv.diminuirVolume();
                    break;
                case 5:
                    smartTv.aumentarCanal();
                    break;
                case 6:
                    smartTv.diminuirCanal();
                    break;
                case 7:
                    smartTv.mostrarStatusSmartTv();
                    break;
                    case 0:
                        System.out.print("Até a próxima! ");
                        break;
                default:
                    System.out.print("Opção inválida!");
                    break;
            }
            for (int i = 0; i < 5; i++) { // Exibe pontos gradativamente
            try {
                Thread.sleep(500); // Aguarda 1 segundo
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
        scanner.close();
    }
    public  static void  mostrarMenu(){
        System.out.print("*********************************");
        System.out.print("\nDigite um número do comando: ");
        System.out.print("\n1 - Ligar SmartTv");
        System.out.print("      2 - Desligar SmartTv");
        System.out.print("\n3 - Aumentar Volume");
        System.out.print("    4 - Diminuir Volume");
        System.out.print("\n5 - Canal +");
        System.out.print("            6 - Canal -");
        System.out.print("\n7 - Status SmartTv");
        System.out.print("     0 - Finalizar programa\n");
    }
}
