package org.example.exercicioProxy2;

import java.util.HashMap;
import java.util.Map;

public class ProxyServicoSms {
    private ServicoSms servicoReal;
    private Map<String, Integer> contadorMensagens;
    private static final int LIMITE_DIARIO = 3;

    public ProxyServicoSms() {
        this.servicoReal = new ServicoSms();
        this.contadorMensagens = new HashMap<>();
    }

    public void envia(String numero, String mensagem) {
        int mensagensEnviadas = contadorMensagens.getOrDefault(numero, 0);

        if (mensagensEnviadas < LIMITE_DIARIO) {
            servicoReal.envia(numero, mensagem);
            contadorMensagens.put(numero, mensagensEnviadas + 1);
        } else {
            System.out.println("Limite diário de " + LIMITE_DIARIO + " mensagens atingido para " + numero);
        }
    }
}