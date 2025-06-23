package Questão6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //resposta: 12:00

        List<String> horarios = new ArrayList<>();
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");

        System.out.println(horarios.get(1));
    }
}
