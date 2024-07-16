package org.example;

public class ListaCompras {

    private Conteudo conteudo;

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        if (this.conteudo == null) {
            throw new NullPointerException("Lista de Compras sem conteúdo");
        }
        return this.conteudo.getConteudo();
    }
}
