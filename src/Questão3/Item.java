package Questão3;

public class Item {
    String nome;
    int qtd;

    public Item(String nome) {
        this.nome = nome;
        this.qtd = 1;
    }

    public Item(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }
}
