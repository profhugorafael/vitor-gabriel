import model.Arqueiro;
import model.Personagem;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Personagem flash = new Personagem("Barry Allen", 50, 100, 10);
        List<Personagem> liga_da_justica = new ArrayList<>();

        liga_da_justica.add(flash);
        liga_da_justica.add(new Arqueiro("Arqueiro verde", 1, 1, 1, 1, 1));

        liga_da_justica.forEach(System.out::println);

//        Arqueiro arqueiro = (Arqueiro) flash;
//        int b = (int)3.5;
    }
}