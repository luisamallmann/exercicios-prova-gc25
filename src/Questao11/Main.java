package Questao11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //resposta: 2025-06-19
        LocalDate hoje = LocalDate.of(2025,6,9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);
    }
}
