import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Pessoa {

    protected String nome;
    protected Date nascimento;
    protected String genero;
    protected Double altura;
    protected Double peso;

    public Pessoa(String nome, String nascimento, String genero, double altura, double peso) throws ParseException{
        this.nome = nome;
        this.nascimento = nascimentoToDate(nascimento);
        this.genero = genero;
        this.altura = altura;
        this.peso = altura;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Date getNascimento(){
        return nascimento;
    }
    public void setNascimento(Date nascimento){
        this.nascimento = nascimento;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public int calcularIdade(){

        Date actualDate = new Date();

        long diffInMillies = Math.abs(actualDate.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff / 365;
    }
    public static Date nascimentoToDate(String nascimento) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return simpleDateFormat.parse(nascimento);
    }
    public static String nascimentoToString(Date nascimento) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return simpleDateFormat.format(nascimento);
    }
    public String toString(){
        try {
            return "Nome: " + nome + ", Data de Nascimento: " + nascimentoToString(nascimento) + ", Gênero: " + genero
            + ", Altura: " + altura + ", Peso: " + peso + ", Idade: " + calcularIdade();
        } catch (ParseException e) {
            e.printStackTrace();
            return "Erro ao converter a data de nascimento.";
        }

    }
    
}
