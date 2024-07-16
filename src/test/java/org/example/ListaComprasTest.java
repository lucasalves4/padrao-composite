package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaComprasTest {

    @Test
    void deveRetornarConteudoListaCompras() {
        Secao secao1 = new Secao("Hortifruti");

        Secao secao2 = new Secao("Padaria");
        Item item21 = new Item("Pão", 2);
        secao2.addConteudo(item21);

        Secao secao3 = new Secao("Bebidas");
        Item item31 = new Item("Refrigerante", 3);
        Item item32 = new Item("Suco de Laranja", 4);
        secao3.addConteudo(item31);
        secao3.addConteudo(item32);

        Secao conteudo = new Secao("Lista de Compras");
        conteudo.addConteudo(secao1);
        conteudo.addConteudo(secao2);
        conteudo.addConteudo(secao3);

        ListaCompras listaCompras = new ListaCompras();
        listaCompras.setConteudo(conteudo);

        assertEquals("Seção: Lista de Compras\n" +
                "Seção: Hortifruti\n" +
                "Seção: Padaria\n" +
                "Item: Pão - quantidade: 2\n" +
                "Seção: Bebidas\n" +
                "Item: Refrigerante - quantidade: 3\n" +
                "Item: Suco de Laranja - quantidade: 4\n", listaCompras.getConteudo());
    }

    @Test
    void deveRetornarExcecaoListaComprasSemConteudo() {
        try {
            ListaCompras listaCompras = new ListaCompras();
            listaCompras.getConteudo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Lista de Compras sem conteúdo", e.getMessage());
        }
    }

}