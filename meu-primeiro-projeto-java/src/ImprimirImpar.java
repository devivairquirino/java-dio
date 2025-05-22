public class ImprimirImpar {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // quando numero for par ele pula a interação e repete o laço
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }
    }
}
