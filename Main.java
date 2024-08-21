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

       Academia academiaEscolhida = academia1; //só pra inicializar
       int i = 0;
       System.out.println("Deseja cadastrar alunos a qual academia?\n1 - Cross Fit 2 - Espaço Esporte");
       i = scr.nextInt();
       if(i == 1){
        academiaEscolhida = academia1;
       }
       if(i == 2){
        academiaEscolhida = academia2;
       } 
       else if(i < 1 || i > 2){
        System.out.println("Academia inválida!");
        scr.close();
        return;
       }
       scr.nextLine();
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
                academiaEscolhida.addAluno(aluno);
                System.out.println("Aluno cadastrado com sucesso!");

            } catch (ParseException e) {
                System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
            }

            System.out.print("Deseja adicionar outro aluno? (sim/não): ");
            continuar = scr.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));
       
       System.out.println("Dados atualizados:\n");
       System.out.println(academia1.getNome() + "\n" + academia1.getTelefone() +  "\n" + academia1.getEndereco() + "\n");

       System.out.println("Alunos:");
       for (Aluno item : academia1.getAlunos()) {
        System.out.println(item);
    }

       System.out.println("\n" + academia2.getNome() + "\n" + academia2.getTelefone() +  "\n" + academia2.getEndereco() + "\n");

       System.out.println("Alunos:");
       for(Aluno item : academia2.getAlunos()){
       System.out.println(item.toString());

     }

     scr.close();
    }
 
}