package Questão7;

public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }

    public String stauts(){
        if(emprestado){
            return "Indisponível";
        }
        return "Disponível";
    }
}
