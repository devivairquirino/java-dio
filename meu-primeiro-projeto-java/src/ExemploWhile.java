import java.util.Random;
public class ExemploWhile {
    public static void main(String[] args) {
        Double numero = gerarNumeroAleatorio();
        Double resultado = Math.round(numero * 100.0)/100.0;
        System.out.println(resultado);
    }
    public static Double gerarNumeroAleatorio(){
        Random random= new Random();
        return 2 + (15-2)*random.nextDouble();
    }
}
