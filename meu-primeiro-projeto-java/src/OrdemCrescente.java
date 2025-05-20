public class OrdemCrescente {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 3;

        int menor = a;
        int meio = b;
        int maior = c;

        if(b<=a && b<=c){
            menor = b;
            meio = a;
            maior = c;
            if(c<a){
                meio= c;
                maior= a;
            }
        }
        if(c<=a && c<=b){
            menor= c;
            meio= a;
            maior = b;
            if(b<a){
                meio= b;
                maior= a;
            }
        }
        if(c<=b && a<=b && a<=c){
            meio= c;
            maior= b;
        }

        System.out.println("Ordem Crescente: " + menor + " > " + meio +" > " + " > " + maior);
        System.out.println("Ordem Decrescente: " + maior + " > " + meio +" > " + " > " + menor);
    } 
}
