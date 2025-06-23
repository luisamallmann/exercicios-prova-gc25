package Questao14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //resposta: [Almoçar, Dormir, Estudar]
        List<Tarefa> tarefa = new ArrayList<>();
        tarefa.add(new Tarefa("Estudar"));
        tarefa.add(new Tarefa("Almoçar"));
        tarefa.add(new Tarefa("Dormir"));

        Collections.sort(tarefa);
        System.out.println(tarefa);
    }
}
