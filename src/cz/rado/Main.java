package cz.rado;

import cz.rado.model.Karta;
import cz.rado.model.Pamet;
import cz.rado.model.Pc;
import cz.rado.model.Procesor;
import cz.rado.model.enumerations.TypKarty;
import cz.rado.services.Konfigurator;
import cz.rado.vyjimky.NedostatekMistaProModuly;
import cz.rado.vyjimky.PametiNejsouStejne;
import cz.rado.vyjimky.PocetPametiMusiBytSudy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PocetPametiMusiBytSudy, PametiNejsouStejne, NedostatekMistaProModuly {
       Pc pc = new Pc(5);
       Konfigurator konfigurator = new Konfigurator();


       Pamet pamet = new Pamet("1024Mb", "3.5Ghz");
       Pamet pamet2 = new Pamet("1024Mb", "3.5Ghz");
       Procesor procesor = new Procesor("AMD","3Ghz");
       Karta karta = new Karta(TypKarty.GRAFICKA);
       Karta karta1 = new Karta(TypKarty.SITOVA);


        konfigurator.vlozPamet(pc, pamet);
        konfigurator.vlozPamet(pc, pamet);



        System.out.println(pc.getPamet().size());
       konfigurator.vlozProcesor(pc,procesor);
       konfigurator.vlozKartu(pc, karta);
       konfigurator.vlozKartu(pc, karta1);

        System.out.println(pc);
    }
}
