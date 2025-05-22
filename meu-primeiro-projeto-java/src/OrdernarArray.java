import java.util.Arrays;

public class OrdernarArray {

    public static void main(String[] args) {
        int[] teste={3,4,1,9,2,5,0,-6};
        
        int [] resultado= ordernarArray(teste);
        
        
        System.out.println(Arrays.toString(resultado));
        // teste= filtrarArray(teste, 2);
        // System.out.println(Arrays.toString(teste));

    }
    public static int[] ordernarArray(int[] array){
        int [] arrayOrdenado= array;


            for(int i=0; i<arrayOrdenado.length; i++){

                for(int j=0; j<array.length;j++){

                    if(array[j]<arrayOrdenado[i]){
                        arrayOrdenado[i]=array[j];
                        array=filtrarArray(array, j);
                        // System.out.println(Arrays.toString(array));
                    }
                }
            }
            // System.err.println(i);

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