package org.example;

public class Item extends Conteudo {

    private int quantidade;

    public Item(String descricao, int quantidade) {
        super(descricao);
        this.quantidade = quantidade;
    }

    public int getCargaHoraria() {
        return quantidade;
    }

    public void setCargaHoraria(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getConteudo() {
        return "Item: " + this.getDescricao() + " - quantidade: " + this.quantidade + "\n";
    }
}
