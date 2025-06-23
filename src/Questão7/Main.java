package Questão7;

public class Main {
    public static void main(String[] args) {
        //resposta: disponível/indisponível

        Livro l = new Livro();
        l.titulo = "Java para iniciantes";
        System.out.println(l.stauts());
        l.emprestar();
        System.out.println(l.stauts());
    }
}
