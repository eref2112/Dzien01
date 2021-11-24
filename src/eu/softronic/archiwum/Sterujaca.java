package eu.softronic.archiwum;

import eu.softronic.Utils;
import pl.softronic.erfi.zus.Przyklady;
import pl.softronic.erfi.zus.dane.Pracownik;
import pl.softronic.erfi.zus.dane.PracownikEtatowy;

public class Sterujaca {

    void testujKlasy2() {
        testujPracownikow();

    }

    private void testujPracownikow() {

        //Wywołąnie po zaimportowaniu jawnym oraz z podaniem ścieżki (nazwy) pakietu
        eu.softronic.archiwum.Pracownik prac = new  eu.softronic.archiwum.Pracownik();
        PracownikEtatowy pracEt = new PracownikEtatowy();
        Pracownik prac1 = new Pracownik();


    }


    void testujKlasy1() {
        Przyklady przyklady1 = new Przyklady();
        Przyklady przyklady2 = new Przyklady();



        //przyklady1.powitaj();
        //przyklady1.powitanie = "Hejka";
        //przyklady1.setPowitanie("O la Boga");

        //System.out.println(przyklady1.getPowitanie() + " z klasy Startowa");
        //System.out.println(przyklady2.getPowitanie() + " z obiektu przyklady2");

        //Dotyczy metod i pól statycznych

        //System.out.println("" + Przyklady.powitanieStatyczne);

        //Konsruktory
        //Konstruktor domyślny
        Pracownik prac1 = new Pracownik();
        prac1.setImie("Kamil");
        //System.out.println(prac1.imie);
        System.out.println(prac1);


        //Utworzony przez programistę
        Pracownik prac2 = new Pracownik("Wojciech","Malinowski", 45);
        System.out.println(prac1);

        Pracownik prac3 = new Pracownik("Michał","Jankowski");
        System.out.println(prac1);

        //Do pól instancji (obiektu) nie można się odwołać przez klasę
        //Pracownik.wiek = 20;

        System.out.println(prac2);
        //Przez klasę można się odwoływać za pomocą poł i metod statycznych (static)
        Pracownik.liczbaPracowników = 11;

        //Testowanie metody toString();
        //System.out.println(prac2.imie + " " + prac2.nazwisko + " " + prac2.wiek);
        System.out.println(prac2);
        //System.out.println(prac3.imie);
        System.out.println(prac3);

        //test metody setWiek (oglnie metod set)
        Pracownik prac4 = new Pracownik("Karol","Krawczyk");
        prac4.setWiek(40);


        //prac4.setPensja(400_000f);

        //System.out.println(prac4);
        Utils.wyswietl(prac4);


    }


}
