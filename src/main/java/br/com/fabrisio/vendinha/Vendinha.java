package br.com.fabrisio.vendinha;

import java.util.Scanner;

public class Vendinha {

    public static void main(String[] args) {
        
        try (Scanner ler = new Scanner(System.in)){
            String nameClient;
            String cpfClient;
            Integer moneyClient;
            String nomeProduto;
            Integer quantidadeProduto;
            
            Produto produto1 = new Produto();
            System.out.println("Produto - " + produto1.getNomeProduto());
            System.out.println("Preço - " + produto1.getPreco());
            System.out.println("Qtd em estoque - " + produto1.getQtd());
            System.out.println("--------------------------------------------");
            System.out.println("Bem-vindo a Vendinha");
            System.out.println("Qual o seu nome:");
            nameClient = ler.next();
            System.out.println("Qual o cpf:");
            cpfClient = ler.next();
            System.out.println("Qual o produto que voce deseja:");
            nomeProduto = ler.next();
            System.out.println("Quantidade do produto");
            quantidadeProduto = ler.nextInt();
            System.out.println("Valor em dinheiro:");
            moneyClient = ler.nextInt();
            Cliente cliente1 = new Cliente(nameClient, cpfClient, moneyClient);
            cliente1.comprar(produto1, quantidadeProduto, cliente1);

        } catch (Exception e) {

        }
    }
}