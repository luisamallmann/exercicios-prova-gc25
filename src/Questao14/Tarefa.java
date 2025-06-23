package Questao14;

public class Tarefa implements Comparable<Tarefa>{
    String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
