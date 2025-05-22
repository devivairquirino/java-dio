import java.util.Arrays;

public class OrdernarArray {

    public static void main(String[] args) {
        int[] teste={3,4,1,9,2,5,0,-6};
        
        int [] resultado= ordernarArray(teste);
        
        
        System.out.println(Arrays.toString(resultado));
        // teste= filtrarArray(teste, 3);
        // System.out.println(Arrays.toString(teste));

    }
    public static int[] ordernarArray(int[] array){
        int [] arrayOrdenado= Arrays.copyOf(array, array.length);

        for(int i=0;i<arrayOrdenado.length; i++){
            int minIndex=i;
            for(int j=i+1; j<arrayOrdenado.length;j++){
                if(arrayOrdenado[j] < arrayOrdenado[minIndex]){
                    minIndex=j;
                }
            }
            // troca os elementos
            int temp =  arrayOrdenado[i];
            arrayOrdenado[i]=arrayOrdenado[minIndex];
            arrayOrdenado[minIndex]= temp;
        }
        return arrayOrdenado;
    }
    
    // tive que criar um meetodo para filtrar o array
    public static int[] filtrarArray(int[] array, int posicaoElemento){
        int [] novoArray= new int[array.length-1];
        // usado para pular a posicao que deseja retirar do array
        int posicaoNovoArray=0;

        for(int i=0; i<array.length; i++){
            // quando o i chega no valor da posicao do elemento ele não add ao novo array
            if(i!=posicaoElemento){

                novoArray[posicaoNovoArray]= array[i];

                posicaoNovoArray++;
            }
        }
        return novoArray;
    }
}