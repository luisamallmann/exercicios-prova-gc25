package Questão2;

public class Main {
    public static void main(String[] args) {
        //resposta: revisar conteúdo

        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if (media >= 7.0){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("O aluno precisa revisar o conteúdo.");
        }
        System.out.println("Média: "+media);
    }
}
