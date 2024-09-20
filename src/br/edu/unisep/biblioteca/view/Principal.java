package br.edu.unisep.biblioteca.view;

import br.edu.unisep.biblioteca.model.Autor;
import br.edu.unisep.biblioteca.model.Emprestimo;
import br.edu.unisep.biblioteca.model.Livro;
import br.edu.unisep.biblioteca.model.Usuario;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setId(1);
        livro.setTitulo("POO: Preguiçosos Observando Objetos");
        livro.setAutor("Angelo Polli Bernardi");
        livro.setEditora("Unisep");
        livro.setGenero("Romance");
        livro.setDataPublicacao("14/09/2024");

        Autor autor = new Autor();

        autor.setId(1);
        autor.setNome(" Angelo Polli Bernardi");
        autor.setIdade(" 18 Anos");
        autor.setLivros(" POO: Preguiçosos Observando Objetos | Ctrl+C, Ctrl+V: A Arte do Desenvolvimento| Debugging: Ou Como Culpar o Estagiário ");

        Usuario usuario = new Usuario();

        usuario.setId(1);
        usuario.setNome(" Ariel Guareschi");
        usuario.setEmail(" arielguareshi.unisepdv2024@gmail.com");
        usuario.setCpf(" 666.333.222.11");
        usuario.setTelefone(" 4002-8922");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdEmprestimo(1);
        emprestimo.setNomeEmprestimo("Ariel Guareschi");
        emprestimo.setDataEmprestimo("14/09/2024");
        emprestimo.setHoraEmprestimo("14:33");
        emprestimo.setDiaRetornoEmprestimo("14/10/2024");
        emprestimo.setDescEmprestimo(" POO: Preguiçosos Observando Objetos");

        JOptionPane.showMessageDialog(null, emprestimo + livro.toString() + autor.toString() + emprestimo.toString());

    }
}


