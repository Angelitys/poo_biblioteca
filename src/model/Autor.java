package model;

public class Autor {

    private int id;
    private String nome;
    private String idade;
    private String  livros;

    public Autor() {

    }

    public Autor(int id, String nome, String idade, String livros) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.livros = livros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "~~AUTOR~~\n" +
                "Id: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Livro: " + livros + "\n" +
                "Idade: " + idade + "\n";
    }

}





