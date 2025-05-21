public class AboutMe {
    public static void main(String[] args){
        String nome= args[0];
        String sobrenome= args[1];
        int idade= Integer.parseInt(args[2]);
        Double altura= Double.parseDouble(args[3]);
        System.out.println("Nome: "+nome+" "+sobrenome+"\n");
        System.out.println("Idade: "+idade+"\n");
        System.out.println("Altura: "+altura+"");
    }
}
