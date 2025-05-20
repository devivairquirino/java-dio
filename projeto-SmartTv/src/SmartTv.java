public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume= 10;

    public void ligarTv(){
        ligada= true;
        System.out.println("Ligando SmartTv...");
    }
    public void desligarTv(){
        ligada= false;
        System.out.println("Desligando SmartTv...");  
    }
}
