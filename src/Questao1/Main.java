package Questao1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //resposta: 12

        LocalDate base = LocalDate.of(2025,6,1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias*2-3);
        System.out.println(novaData.getDayOfMonth());
    }
}