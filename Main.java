public class Main {
    
    public static void main(String[] args) {

       Academia a = new Academia("Sport Center", "40028922", "Rua Moranguinho, 821");
       Academia b = new Academia("Aquafit", "99765412", "Rua Laranjinha, 501");

       System.out.println("Dados iniciais:");
       System.out.println(a.getNome() + "\n" + a.getTelefone() +  "\n" + a.getEndereco() + "\n");
       System.out.println(b.getNome() + "\n" + b.getTelefone() +  "\n" + b.getEndereco() + "\n");

       a.setNome("Cross Fit");
       a.setTelefone("99435671");
       a.setEndereco("Rua Ameixinha, 988");

       b.setNome("Espaço Esporte");
       b.setTelefone("99440018");
       b.setEndereco("Rua Café Olé, 444");

       System.out.println("Dados atualizados:");
       System.out.println(a.getNome() + "\n" + a.getTelefone() +  "\n" + a.getEndereco() + "\n");
       System.out.println(b.getNome() + "\n" + b.getTelefone() +  "\n" + b.getEndereco() + "\n");



    }
 
}
