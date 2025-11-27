package org.example.exercicioFacade1;

/* TODO: SISTEMA DE REPRODUÇÃO DE VÍDEO:
    O sistema tem várias etapas para poder iniciar a reprodução de um vídeo.
    AS etapas são carregar o arquivo, decodificar o áudio, decodificar o vídeo e só depois iniciar a reprodução.

    Aplique o padrão de Projeto Facade neste contexto.

 */

public class Main {

    public static void main(String[] args) {
       
        SistemaDeReproducaoFacade sistema = new SistemaDeReproducaoFacade();
        sistema.reproduzirMidia("video.mp4");
        sistema.reproduzirMidia("musica.mp3");
        sistema.reproduzirMidia("documentario.avi");
        sistema.reproduzirMidia("filme.mkv");
        sistema.reproduzirMidia("animação.mov");
        sistema.reproduzirMidia("clipe.flv");

    }
}
