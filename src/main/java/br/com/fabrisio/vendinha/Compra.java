package br.com.fabrisio.vendinha;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode.Include;

/**
 * Compra
 */
public class Compra {

    private String clientCompra;
    private BigDecimal precoCompra;
    private Integer qtdCompra;
    private BigDecimal troco;
    private BigDecimal dinheiroClient;


    public Compra(Produto produto1, Integer qtd, Cliente cliente1) {
        
        this.clientCompra = cliente1.getCliente();
        this.precoCompra = produto1.getPreco();
        this.qtdCompra = produto1.getQtd();
        this.dinheiroClient = cliente1.getMoney();

        retornoCompra(produto1, qtd, cliente1);
    }

    public void retornoCompra(Produto produto1, Integer qtd, Cliente cliente1) {

        BigDecimal p = BigDecimal.valueOf(qtd);

        if(qtd<=qtdCompra){
            troco = dinheiroClient.subtract(precoCompra.multiply(p));
            Integer trocoInt = 0;
            trocoInt = Integer.valueOf(troco.intValue());
            System.out.println(getCompra(trocoInt));
            if(trocoInt>0){
                System.out.println("Troco : " + troco);
            }else if(trocoInt<0){
                System.out.println("Falta : " + troco);
            }else{
                System.out.println("Valor Correto");
            }
            produto1.atualizar(qtd);
        }else{
            System.out.println("Solicitasse mais do que temos em estoque");
        }
    }

    public EnumCompra getCompra(Integer trocoInt){
        if(trocoInt>0){
            return EnumCompra.Efetuada;
        }
        if(trocoInt<0){
            return EnumCompra.FaltaDinheiro;
        }
        return EnumCompra.Efetuada;
    }
}