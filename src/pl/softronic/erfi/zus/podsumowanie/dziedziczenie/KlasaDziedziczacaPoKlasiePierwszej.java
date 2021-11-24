package pl.softronic.erfi.zus.podsumowanie.dziedziczenie;

import eu.softronic.Utils;

public class KlasaDziedziczacaPoKlasiePierwszej extends KlasaBazowaPierwsza {
    public KlasaDziedziczacaPoKlasiePierwszej(){

    }



    public void metoda(){
        super.wyswietlKomunikat();
        Utils.wyswietl("uruchomienie metody z klasy KlasaDziedziczacaPoKlasiePierwszej" );
    }
}
