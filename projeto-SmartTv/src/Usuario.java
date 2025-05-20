public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv= new SmartTv();
        //Comandos volume e canal so funcionam se a tv estiver ligada
        smartTv.aumentarVolume();
        smartTv.mudarCanal(9);

        smartTv.ligarTv();

        smartTv.mostrarStatusSmartTv();

        
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(24);

        smartTv.mostrarStatusSmartTv();

    }
}
