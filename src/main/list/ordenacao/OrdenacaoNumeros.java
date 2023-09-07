package main.list.ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class OrdenacaoNumeros{
    List<Integer> numsList;
    
    public OrdenacaoNumeros() {
        this.numsList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numsList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosEmOrdemAscendente = new ArrayList<>(numsList);
        Collections.sort(numerosEmOrdemAscendente);

        return numerosEmOrdemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosEmOrdemDescendente = new ArrayList<>(numsList);
        Collections.sort(numerosEmOrdemDescendente, Collections.reverseOrder());

        return numerosEmOrdemDescendente;
    }

    public void exibirNumeros() {
        System.out.println(numsList);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
