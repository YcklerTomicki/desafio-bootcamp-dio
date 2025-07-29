package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {

    private String nomeDev;
    private String nomeBootcamp;
    private LocalDate dataConclusao;

    public Certificado(String nomeDev, String nomeBootcamp, LocalDate dataConclusao) {
        this.nomeDev = nomeDev;
        this.nomeBootcamp = nomeBootcamp;
        this.dataConclusao = dataConclusao;
    }

    public void exibirCertificado(){
        System.out.println("====================================");
        System.out.println("Certificado de Conclusão de Bootcamp");
        System.out.println("Desenvolvedor: " + nomeDev);
        System.out.println("Bootcamp: " + nomeBootcamp);
        System.out.println("Data: " + dataConclusao);
        System.out.println("====================================");
    }
}