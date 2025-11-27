package org.example.exercicioProxy1;

public class LivroDigitalProxy implements Livro {
    private LivroDigital livroDigital;
    private boolean usuarioPremium;

    public LivroDigitalProxy(String titulo, String conteudo, boolean usuarioPremium) {
        this.livroDigital = new LivroDigital(titulo, conteudo);
        this.usuarioPremium = usuarioPremium;
    }

    @Override
    public void ler() {
        if (usuarioPremium) {
            livroDigital.ler();
        } else {
            System.out.println("Título: " + livroDigital.getTitulo());
            System.out.println("Assine o plano Premium para acessar o conteúdo completo.");
        }
    }

    public void setUsuarioPremium(boolean usuarioPremium) {
        this.usuarioPremium = usuarioPremium;
    }
}
