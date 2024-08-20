import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws ParseException {

       Academia academia1 = new Academia("Sport Center", "40028922", "Rua Moranguinho, 821");
       Academia academia2 = new Academia("Aquafit", "99765412", "Rua Laranjinha, 501");

       Scanner scr = new Scanner(System.in);
       List<Aluno> alunos = new ArrayList<>();

       System.out.println("Dados iniciais:");
       System.out.println(academia1.getNome() + "\n" + academia1.getTelefone() +  "\n" + academia1.getEndereco() + "\n");
       System.out.println(academia2.getNome() + "\n" + academia2.getTelefone() +  "\n" + academia2.getEndereco() + "\n");

       academia1.setNome("Cross Fit");
       academia1.setTelefone("99435671");
       academia1.setEndereco("Rua Ameixinha, 988");

       academia2.setNome("Espaço Esporte");
       academia2.setTelefone("99440018");
       academia2.setEndereco("Rua Café Olé, 444");


       /*
       //aluno academia 1
       Aluno aluno1 = new Aluno("Gabriela", "05/07/2000", "iniciante");
       academia1.alunos.add(aluno1);
       academia1.alunos.add(new Aluno("Joana", "10/07/2001", "intermediario", "Feminino", 0, 0));
       academia1.alunos.add(new Aluno("Pedro",  "19/06/2006", "intermediario"));
       //alunos academia 2
       academia2.alunos.add(new Aluno("Rafael",  "20/08/1995", "iniciante"));
       academia2.alunos.add(new Aluno("Fernanda", "21/12/1999", "iniciante"));
       academia2.alunos.add(new Aluno("Marcelo", "27/04/1978", "avançado"));
       */

       //usuario insere os dados

       
        String continuar;
        do {
            System.out.println("Digite os dados do aluno:");

            System.out.print("Nome: ");
            String nome = scr.nextLine();

            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            String nascimento = scr.nextLine();

            System.out.print("Nível: ");
            String nivel = scr.nextLine();

            System.out.print("Gênero: ");
            String genero = scr.nextLine();

            System.out.print("Altura (em metros): ");
            double altura = Double.parseDouble(scr.nextLine());

            System.out.print("Peso (em kg): ");
            double peso = Double.parseDouble(scr.nextLine());

            try {
                Aluno aluno = new Aluno(nome, nascimento, nivel, genero, altura, peso);
                alunos.add(aluno);
                System.out.println("Aluno cadastrado com sucesso!");

            } catch (ParseException e) {
                System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
            }

            System.out.print("Deseja adicionar outro aluno? (sim/não): ");
            continuar = scr.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));

        

        scr.close();

       
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