package org.example.exercicioFacade1;

public class SistemaDeReproducaoFacade {
    private CarregadorDeArquivo carregadorDeArquivo;
    private DecodificadorDeAudio decodificadorDeAudio;
    private DecodificadorDeVideo decodificadorDeVideo;
    private Reprodutor reprodutor;

    SistemaDeReproducaoFacade(){
        this.carregadorDeArquivo = new CarregadorDeArquivo();
        this.decodificadorDeAudio = new DecodificadorDeAudio();
        this.decodificadorDeVideo = new DecodificadorDeVideo();
        this.reprodutor = new Reprodutor();
    }

    public void reproduzirMidia(String nomeArquivo) {
        carregadorDeArquivo.carregar(nomeArquivo);
        decodificadorDeAudio.decodificar();
        decodificadorDeVideo.decodificar();
        reprodutor.reproduzir();
    }

    public void pararReproducao() {
        System.out.println("Reprodução parada.");
    }

    public void pausarReproducao() {
        System.out.println("Reprodução pausada.");
    }   

    public void ajustarVolume(int nivelVolume) {
        System.out.println("Volume ajustado para: " + nivelVolume);
    }

    public void avancarFaixa() {
        System.out.println("Avançando para a próxima faixa.");
    } 
}
