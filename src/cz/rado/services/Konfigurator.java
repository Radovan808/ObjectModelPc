package cz.rado.services;

import cz.rado.model.Karta;
import cz.rado.model.Pamet;
import cz.rado.model.Pc;
import cz.rado.model.Procesor;
import cz.rado.utils.PcUtils;
import cz.rado.vyjimky.NedostatekMistaProModuly;
import cz.rado.vyjimky.PametiNejsouStejne;
import cz.rado.vyjimky.PocetPametiMusiBytSudy;

import java.util.Arrays;

public class Konfigurator implements KonfiguracniRozhrani {
    @Override
    public void vlozPameti(Pc pc, Pamet... pameti)
            throws NedostatekMistaProModuly, PocetPametiMusiBytSudy, PametiNejsouStejne {
        PcUtils.overMoznostVlozeniPameti(pc, pameti);
        pc.setPamet(Arrays.asList(pameti));

    }

    @Override
    public void vlozPamet(Pc pc, Pamet pamet) throws PocetPametiMusiBytSudy {

             pc.getPamet().add(pamet);
    }

    @Override
    public void vlozProcesor(Pc pc, Procesor procesor) {
        pc.setProcesor(procesor);
    }

    @Override
    public void vlozKartu(Pc pc, Karta karta) {
      pc.getKarty().add(karta);

    }


    }

