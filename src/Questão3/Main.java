package Questão3;

public class Main {
    public static void main(String[] args) {
        //resposta: 4

        Item i1 = new Item("Caderno");
        Item i2 = new Item("Caneta",3);

        System.out.println(i1.qtd+i2.qtd);
    }
}
