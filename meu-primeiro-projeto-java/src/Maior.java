public class Maior {
    public static void main(String[] args) {
        int a= 10;
        int b= 1;
        int c= 9;

        int maior= a;

        if (b >maior)
            maior=b;
        if (c>maior)
            maior=c;

        System.out.println("O maior número é: " + maior);
    }

}