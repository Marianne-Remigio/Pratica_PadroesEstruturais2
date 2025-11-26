package org.example.exercicioProxy2;

public class Main {
    public static void main(String[] args) {
        ProxyServicoSms smsProxy = new ProxyServicoSms();

        // test
        smsProxy.envia("99999-9090", "Código de verificação: 123456");
        smsProxy.envia("99999-9090", "Código de verificação: 567890");
        smsProxy.envia("99999-9090", "Código de verificação: 111111");
        smsProxy.envia("99999-9090", "Código de verificação: 222222"); // toma block

        smsProxy.envia("88888-8888", "Código de verificação: 333333"); // outro numero
    }
}
