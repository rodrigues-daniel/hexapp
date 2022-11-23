package br.lab.application;

import org.springframework.stereotype.Service;

@Service
public class OrderApplicationService {
    private String nome = "Teste";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
