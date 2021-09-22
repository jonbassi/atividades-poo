package fatec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    //Criar lista de carta
    private static List<Carta> baralho = new ArrayList<Carta>();

    //Montando lista de carta com enum
    public void montar() {
        for (Valor valor : Valor.values()) {
            for (Naipe naipe : Naipe.values()) {
                //adiciona uma carta ao baralho
                baralho.add(new Carta(valor, naipe));
            }
        }
    }

    //Embaralha a lista
    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    //Mostra baralho
    public void exibir() {
        for (int x = 0; x<baralho.size(); x++) {
            System.out.println(baralho.get(x).toString());
        }
    }

}




