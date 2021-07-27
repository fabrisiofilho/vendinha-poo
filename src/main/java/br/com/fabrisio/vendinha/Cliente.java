package br.com.fabrisio.vendinha;

import java.math.BigDecimal;
/**
 * Cliente
 */
public class Cliente {

    private String name;
    private String cpf;
    private BigDecimal money;
    
    public Cliente(String nameClient, String cpfClient, double moneyClient){
        this.name = nameClient;
        this.cpf = cpfClient;
        this.money = BigDecimal.valueOf(moneyClient);
    }

    public Compra comprar(Produto produto1, Integer qtd, Cliente cliente1){
        if(qtd>0){
            return new Compra(produto1, qtd, cliente1);
        }
        throw new RuntimeException("Informe um valor correspondente");
    }

    public BigDecimal getMoney(){
        return money;
    }

    public String getCliente(){
        return name;
    }
}