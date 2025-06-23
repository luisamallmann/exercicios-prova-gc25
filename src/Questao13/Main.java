package Questao13;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //resposta: entrega fora do horario
        LocalTime envio = LocalTime.of(23,0);
        LocalTime limite = LocalTime.of(22,59);

        if(!envio.isBefore(limite)){
            System.out.println("Entrega Fora do Horário");
        } else {
            System.out.println("Tarefa enviada com sucesso");
        }
    }
}
