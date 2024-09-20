package br.edu.unisep.biblioteca.model;

public class Livro {
    private int id;
    private String titulo;
    private String dataPublicacao;
    private String autor;
    private String editora;
    private String genero;


    public Livro(int id, String titulo, String dataPublicacao, String autor, String editora, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Livro() {


    }
    @Override
    public String toString() {
        return "~~DESCRIÇÃO DO LIVRO~~\n" +
                "Id: " + id+ "\n" +
                "Título: " + titulo+ "\n" +
                "Publicado no dia : " + dataPublicacao+ "\n" +
                "Autor: " + autor+ "\n" +
                "Editora: " + editora+ "\n" +
                "Genero Textual : " + genero + "\n";
    }


}
