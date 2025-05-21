public class TesteArgs {
    public static void main(String[] args) {
        String[] cliente={"Ivair","Quirino","29","1.74"};
        mostrarDados(cliente);
    }
    public static void mostrarDados(String[] args){
        String nome= args[0];
        String sobreNome= args[1];
        int idade= Integer.parseInt(args[2]);
        Double altura= Double.parseDouble(args[3]);

        System.out.println("Nome: "+nome+" "+sobreNome+"\n");
        System.out.println("Idade: "+idade+"\n");
        System.out.println("Altura: "+altura+"");
    }
}
