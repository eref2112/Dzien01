package pl.softronic.erfi.zus;

import eu.softronic.Utils;

//Można tak
//import pl.softronic.erfi.zus.dane.Pracownik;
//import pl.softronic.erfi.zus.dane.PracownikEtatowy;

//Można i tak
import pl.softronic.erfi.zus.dane.*;
import pl.softronic.erfi.zus.dane.Pracownik;
import pl.softronic.erfi.zus.podsumowanie.dziedziczenie.*;

public class Sterujaca {

    void testujKlasy2() {
        //testujPracownikowIsA();
        //testujPracownikowHasA();

        //testujPodsumowanieKlas();
        testujInstanceOf();
    }

    private void testujInstanceOf() {
        /*
        Klasa Objet jest na szczcie hierarchii dzidziczenia;
         */

        KlasaDziedziczacaNaDrugimPoziomie zm1 = new KlasaDziedziczacaNaTrzecimPoziomie();
        KlasaDziedziczacaNaDrugimPoziomie zm2 = new KlasaDziedziczacaNaDrugimPoziomie();

        boolean czyJest = (zm1 instanceof KlasaDziedziczacaNaDrugimPoziomie);
        //boolean czyJest1 = zm2 instanceof Object;

        String wartosc = ((KlasaDziedziczacaNaDrugimPoziomie) zm1).dana2;
         wartosc = ((KlasaDziedziczacaNaTrzecimPoziomie) zm1).dana3;

        Utils.wyswietl(czyJest);
    }

    private void testujPodsumowanieKlas() {
        //testujemy funkcjonalność klas z podsumowania dziedziczenia
        KlasaDziedziczacaPoKlasiePierwszej k1 = new KlasaDziedziczacaPoKlasiePierwszej();
        k1.metoda();

        KlasaZzadeklarowanaKlasaPierwsza k2 = new KlasaZzadeklarowanaKlasaPierwsza();
        k2.metoda();

    }

    private void testujPracownikowHasA() {
        //Ale nie tylko
        PracownikEtatowy pracEtIs1 = new PracownikEtatowy();
        PracownikEtatowyHasA pracEtHas1 = new PracownikEtatowyHasA();

        //pracEtIs1.setWyksztalcenie("W");
        //pracEtHas1.setWyksztalcenie("W");

        //System.out.println(pracEtIs1.imie + " " + pracEtIs1.nazwisko + " " + pracEtIs1.wyksztalcenie);
        //System.out.println(pracEtHas1.pracownik.imie + " " + pracEtHas1.pracownik.nazwisko + " " + pracEtHas1.wyksztalcenie);

        Pracownicy pracownicy = new Pracownicy();
        //Jak wyświetlić informacje o racowniku pierwszym - prac1
        System.out.println(pracownicy.prac1.pracownik.imie + " " + pracownicy.prac1.pracownik.nazwisko + " " + pracownicy.prac1.wyksztalcenie);


        //Teraz z trzeciego pracownika (od dziedziczenia)
        System.out.println(pracownicy.prac3.imie + " " + pracownicy.prac3.nazwisko + " " + pracownicy.prac3.wyksztalcenie);
    }


















    /*
    Testowanie klasy PracownikEtatowy zbudowanej metodą dziedziczenia
     */
    private void testujPracownikowIsA() {
        //Pracownik z klasy bazowej (podstawowej)
        //Pracownik prac = new Pracownik();
        //Utils.wyswietl(prac);

        //Pracownik z klasy potomnej
        PracownikEtatowy pracEt1 = new PracownikEtatowy();
        Utils.wyswietl(pracEt1);

        //Inne wywołania konstruktorów
        PracownikEtatowy pracEt2 = new PracownikEtatowy("Robert", "Janiszewski", 23, 16, "P",true);
        //Staż okazał się błędny, wprowdzono korektę
        pracEt2.setStaz(18);

        pracEt2.policzPensje();
        Utils.wyswietl(pracEt2);

        //Przykład metody przeciążonej
        boolean zaszczepiony = true;
        pracEt2.policzPensje(zaszczepiony);
        Utils.wyswietl(pracEt2);

        //PracownikEtatowy pracEt3 = new PracownikEtatowy("Robert", "Janiszewski");
        //Utils.wyswietl(pracEt3);

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
