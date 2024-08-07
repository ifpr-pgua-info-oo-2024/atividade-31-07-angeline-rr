import java.util.ArrayList;
import java.util.List;

public class Academia {
    
    private String nome;
    private String telefone;
    private String endereco;

    //alunos

    List<Aluno> alunos;

    public Academia(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        alunos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
       }
       public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
       }
       public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    
    public List<Aluno> getAlunos(){
        return alunos;
    }
}
