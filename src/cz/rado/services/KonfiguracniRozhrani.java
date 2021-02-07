package cz.rado.services;

import cz.rado.model.Karta;
import cz.rado.model.Pamet;
import cz.rado.model.Pc;
import cz.rado.model.Procesor;
import cz.rado.vyjimky.NedostatekMistaProModuly;
import cz.rado.vyjimky.PametiNejsouStejne;
import cz.rado.vyjimky.PocetPametiMusiBytSudy;

public interface KonfiguracniRozhrani {

    void vlozPameti(Pc pc, Pamet... pamet) throws NedostatekMistaProModuly, PocetPametiMusiBytSudy, PametiNejsouStejne;
    void vlozPamet(Pc pc, Pamet pamet) throws PocetPametiMusiBytSudy;
    void vlozProcesor(Pc pc, Procesor procesor);
    void vlozKartu(Pc pc, Karta karta);

}
