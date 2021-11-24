package pl.softronic.erfi.zus.podsumowanie.dziedziczenie;

import eu.softronic.Utils;

public class KlasaZzadeklarowanaKlasaPierwsza {
    public KlasaBazowaPierwsza klasaBazowaPierwsza;

    public KlasaZzadeklarowanaKlasaPierwsza(){
        klasaBazowaPierwsza = new KlasaBazowaPierwsza("nowa wymysla nazwa");
    }

    public KlasaZzadeklarowanaKlasaPierwsza(String nowaNazwa){
        klasaBazowaPierwsza = new KlasaBazowaPierwsza(nowaNazwa);
    }

    public void metoda() {
        klasaBazowaPierwsza.wyswietlKomunikat();
        Utils.wyswietl("uruchomienie metody z klasy KlasaZzadeklarowanaKlasaPierwsza" );
    }


}
