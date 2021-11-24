package pl.softronic.erfi.zus.podsumowanie.dziedziczenie;

import eu.softronic.Utils;

import java.awt.*;

public class KlasaBazowaPierwsza {
    public String nazwa = "";

    public KlasaBazowaPierwsza(){

    }

    public KlasaBazowaPierwsza(String nowaNazwa){
        nazwa = nowaNazwa;
    }

    public void wyswietlKomunikat(){
        Utils.wyswietl("info z klasy pierwszej  " + nazwa);
    }

}
