import java.text.ParseException;

public class Aluno extends Pessoa{

    private String nivel;

    public Aluno(String nome, String nascimento, String nivel, String genero, double altura, double peso) throws ParseException{
        super(nome,nascimento,genero,altura,peso);
        this.nivel = nivel;
    }
    public Aluno(String nome, String nascimento, String nivel) throws ParseException{
        this(nome, nascimento, nivel, " ", 0, 0);
    }
    
    public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    
    public String toString(){
       return super.toString()+", Nível: "+ this.nivel;
    }

}
