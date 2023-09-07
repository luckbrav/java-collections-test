package main.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }

        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorToral = 0.0;

        for (Item item : carrinho) {
            valorToral += item.getPreco() * item.getQtd();
        }

        return valorToral;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.adicionarItem("Desodorante", 10.50, 1);
        meuCarrinho.adicionarItem("Escova", 5.25, 1);
        meuCarrinho.adicionarItem("Papel", 2, 5);
        meuCarrinho.adicionarItem("Goiaba", 99.99, 10);


        meuCarrinho.exibirItens();
        System.out.println("O valor total do carrinho é: " + meuCarrinho.calcularValorTotal());
        
        meuCarrinho.removerItem("Goiaba");
        
        meuCarrinho.exibirItens();
        System.out.println("O valor total do carrinho é: " + meuCarrinho.calcularValorTotal());

    }
}
