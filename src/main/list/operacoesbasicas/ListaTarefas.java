package main.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaDeTarefas = new ListaTarefas();

        System.out.println("O numero total de elementos da lista no momento é " + listaDeTarefas.obterNumeroTotalTarefas());
        
        listaDeTarefas.adicionarTarefa("Lavar a louça");
        listaDeTarefas.adicionarTarefa("Colocar comida para as gatas");
        listaDeTarefas.adicionarTarefa("Levar o lixo");

        System.out.println("O numero total de elementos da lista no momento é " + listaDeTarefas.obterNumeroTotalTarefas());
        
        listaDeTarefas.removerTarefa("Levar o lixo");

        System.out.println("O numero total de elementos da lista no momento é " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.obterDescricoesTarefas();
    }
    
}
