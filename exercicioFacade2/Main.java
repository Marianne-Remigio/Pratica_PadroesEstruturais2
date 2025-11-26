package org.example.exercicioFacade2;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Maria", "11111111111", "maria@email.com");
        Usuario usuario2 = new Usuario("José", "22222222222", "jose@gmail.com");

        CadastroUsuarioFacade cadastroFacade = new CadastroUsuarioFacade();

        cadastroFacade.cadastrarUsuario(usuario1);
        cadastroFacade.cadastrarUsuario(usuario2);
        
        cadastroFacade.cadastrarUsuario(usuario2);
    }
}