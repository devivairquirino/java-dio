public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume= 10;

    public void ligarTv(){
        if(ligada){
            System.out.println("A SmartTv já está ligada!");
        }
        else{
            ligada= true;
            System.out.println("Ligando SmartTv...");
        }
    }
    public void desligarTv(){
        if(!ligada){
            System.out.println("A SmartTv já está desligada!");
        }
        else{
            ligada= false;
            System.out.println("Desligando SmartTv...");  
        }
    }
    public void aumentarVolume(){
        if(!ligada){
            System.out.println("SmartTv Desligada, por favor ligue-a!");
        }
        else{
            volume++;
            System.out.println("Volume+ : "+volume); 
        }
    }
    public void diminuirVolume(){
        if(!ligada){
            System.out.println("SmartTv Desligada, por favor ligue-a!");
        }
        else{
            volume--;
            System.out.println("Volume- : "+volume); 
        }  
    }
    public void aumentarCanal(){
        if(!ligada){
            System.out.println("SmartTv Desligada, por favor ligue-a!");
        }
        else{
            canal++;
            System.out.println("Canal+ : "+canal); 
        }   
    }
    public void diminuirCanal(){
        if(!ligada){
            System.out.println("SmartTv Desligada, por favor ligue-a!");
        }
        else{
            canal--;
            System.out.println("Canal- : "+canal); 
        }  
    }
    public void mudarCanal(int novoCanal){
        if(!ligada){
            System.out.println("SmartTv Desligada, por favor ligue-a!");
        }
        else{
            canal= novoCanal;
            System.out.println("Canal : "+canal); 
        }
    }
    // imprime status da smartTv
    public void mostrarStatusSmartTv(){
        System.out.println(" ");
        System.out.println("SmartTv Status >>>>>>>>>>>>>>");
        System.out.println("Ligada: "+ligada);
        System.out.println("Canal: "+canal);
        System.out.println("Volume: "+volume);
        System.out.println(" ");
    }
}
