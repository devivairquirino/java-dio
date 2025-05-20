public class SmartTV {
    public static void main(String[] args) {
        boolean ligada= false;
        int canal= 1;
        int volume= 10;

        System.out.println("SmartTV_Status >>>>");
        System.out.println("Ligada: "+ligada);
        System.out.println("Canal: "+canal); 
        System.out.println("Volume: "+volume);

        ligada= ligarTv(ligada);
        volume= aumentarVolume(volume, ligada);
        canal= mudarCanalPorNumero(canal, 24, ligada);

        System.out.println("SmartTV_Status >>>>");
        System.out.println("Ligada: "+ligada);
        System.out.println("Canal: "+canal); 
        System.out.println("Volume: "+volume); 

    }
    public static boolean ligarTv (boolean ligada){
        return true;
    }
    public static boolean desligarTv (boolean ligada){
        return false;
    }
    public static int aumentarVolume(int volume, boolean ligada){
        return ligada ? volume+1 : volume; 
    }
    public static int diminuirVolume(int volume, boolean ligada){
        return ligada ? volume-1 : volume; 
    }
    public static int mudarCanalMais(int canal, boolean ligada){
        return ligada ? canal+1 : canal; 
    }
    public static int mudarCanalMenos(int canal, boolean ligada){
        return ligada ? canal-1 : canal; 
    }
    public static int mudarCanalPorNumero(int canal,int numeroDigitado, boolean ligada){
        return ligada ? numeroDigitado : canal; 
    }
    
}
