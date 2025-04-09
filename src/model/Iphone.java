package model;

import model.Browser;
import model.ReprodutorAudio;

public class Iphone implements ReprodutorAudio, Telefone, Browser {
    @Override
    public void exibirPagina() {
        System.out.println("Exibir página no navegador...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página no navegador...");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzir música no dispositivo...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar música no dispositivo...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música no dispositivo...");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Realizar ligação com o telefone...");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atender ligação com o telefone...");
    }

    @Override
    public void acessarCaixaPostal() {
        System.out.println("Acessar caixa postal com o telefone...");
    }
}
