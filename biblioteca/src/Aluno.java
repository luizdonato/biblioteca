
public class Aluno {
    // Atributos privados
    private String nome;
    private int idade;
    private String matricula;

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método toString
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
    }

    // Método main para testar
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", 20, "123456");
        System.out.println(aluno);
    }
}
