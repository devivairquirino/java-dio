public class MudarValor {
    public static void main(String[] args) {
        int n1= 10;
        int n2= 3;
        int auxiliar;
        System.out.println("n1= " + n1 + " >> n2= " + n2);

        // O valor n1 vai ser armazenado em n2 e vice versa
        auxiliar= n1;
        n1= n2;
        n2= auxiliar;

        System.out.println("n1= " + n1 + " >> n2= " + n2);

    }
}
