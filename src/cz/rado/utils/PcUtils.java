package cz.rado.utils;

import cz.rado.model.Pamet;
import cz.rado.model.Pc;
import cz.rado.vyjimky.NedostatekMistaProModuly;
import cz.rado.vyjimky.PametiNejsouStejne;
import cz.rado.vyjimky.PocetPametiMusiBytSudy;

public class PcUtils {
    public static void  overMoznostVlozeniPameti(Pc pc, Pamet[] pameti) throws NedostatekMistaProModuly, PocetPametiMusiBytSudy, PametiNejsouStejne {
        int pocetPameti = pameti.length;
        if (pc.getPocetpameti() < pocetPameti){
            throw new NedostatekMistaProModuly();
        }
        if (pocetPameti > 1){
            if (pocetPameti % 2  != 0){
                throw new PocetPametiMusiBytSudy();
            }
        }

        String velikostPameti = null;
        for (Pamet pamet : pameti){
            if (velikostPameti == null){
                velikostPameti = pamet.getVelikost();
            }else {
                if (!velikostPameti.equals(pamet.getVelikost())){
                    throw new PametiNejsouStejne();
                }
            }

        }
    }
}
