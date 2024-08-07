import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    
    public static void main(String[] args) throws ParseException {

       Academia academia1 = new Academia("Sport Center", "40028922", "Rua Moranguinho, 821");
       Academia academia2 = new Academia("Aquafit", "99765412", "Rua Laranjinha, 501");

       System.out.println("Dados iniciais:");
       System.out.println(academia1.getNome() + "\n" + academia1.getTelefone() +  "\n" + academia1.getEndereco() + "\n");
       System.out.println(academia2.getNome() + "\n" + academia2.getTelefone() +  "\n" + academia2.getEndereco() + "\n");

       academia1.setNome("Cross Fit");
       academia1.setTelefone("99435671");
       academia1.setEndereco("Rua Ameixinha, 988");

       academia2.setNome("Espaço Esporte");
       academia2.setTelefone("99440018");
       academia2.setEndereco("Rua Café Olé, 444");


       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

       //aluno academia 1
       Date data0 = formato.parse("05/07/2000");
       Aluno aluno1 = new Aluno("Gabriela", "iniciante", data0);
       academia1.alunos.add(aluno1);
        //OU
       Date data1 = formato.parse("10/07/2001");
       academia1.alunos.add(new Aluno("Joana", "intermediario", data1, "Feminino", 0, 0));

       Date data2 = formato.parse("19/06/2006");

       academia1.alunos.add(new Aluno("Pedro", "intermediario", data2));


       //alunos academia 2
       Date data3 = formato.parse("20/08/1995");
       academia2.alunos.add(new Aluno("Rafael", "iniciante", data3));

       Date data4 = formato.parse("21/12/1999");
       academia2.alunos.add(new Aluno("Fernanda", "iniciante", data4));

       Date data5 = formato.parse("27/04/1978");
       academia2.alunos.add(new Aluno("Marcelo", "avançado", data5));

       
       System.out.println("Dados atualizados:\n");
       System.out.println(academia1.getNome() + "\n" + academia1.getTelefone() +  "\n" + academia1.getEndereco() + "\n");

       System.out.println("Alunos:");
       for(Aluno item : academia1.getAlunos()){
        System.out.println(item.toString());
     }

       System.out.println("\n" + academia2.getNome() + "\n" + academia2.getTelefone() +  "\n" + academia2.getEndereco() + "\n");

       System.out.println("Alunos:");
       for(Aluno item : academia2.getAlunos()){
        System.out.println(item.toString());
     }
    }
 
}