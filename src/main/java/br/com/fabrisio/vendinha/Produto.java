package br.com.fabrisio.vendinha;

import java.math.BigDecimal;
/**
 * Produtos
 */
public class Produto {

    private String nomeProduto;
    private BigDecimal preco;
    private Integer quantidade;

    public Produto(String nomeProduto2) {

        this.nomeProduto = nomeProduto2;
        this.preco = BigDecimal.valueOf(3.5);
        this.quantidade = 10;
    }

    public BigDecimal getPreco(){
        return preco;
    }

    public Integer getQtd(){
        return quantidade;
    }
}