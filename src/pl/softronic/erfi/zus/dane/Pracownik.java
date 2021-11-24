package pl.softronic.erfi.zus.dane;

import eu.softronic.Utils;

/*
Klasa Pracownik klasą bazową, podstawową

Porzebne będą klasy dla pracowników: etatowych, na umowę zlecenie, na umowę o dzieło
 */
public class Pracownik {
  static public int liczbaPracowników = 0;

  public String imie = "Jan";
  public String nazwisko = "Kowalski";
  String pesel = "";
  int wiek = 10;



 public Pracownik() {
  super();
  liczbaPracowników++;
  //Utils.wyswietl("konstruktor bezparametrowy z klasy baza " + this.getClass().getName());
  //albo tak
  //liczbaPracowników = liczbaPracowników + 1;
 }

 public Pracownik(String imie, String nazwisko, int wiek) {
  liczbaPracowników++;
  //Można tak
  //this.imie = imie;
  //this.nazwisko = nazwisko;

  //ale można i tak - wywołanie konstruktora z konstruktora
  //new Pracownik(imie, nazwisko);

  /*
  Można kontrolować w konstruktorze
  i ewentualnie coś z tym robić

  if (wiek > 65 || wiek < 18){
   this.wiek = 0;
  } else {
   this.wiek = wiek;
  }
   */

  this.wiek = wiek;

 }

/*
Nie można mieć dwóch kosruktorów o tej samej sygnaturze
 public Pracownik(String pesel, String nazwisko, int wiek) {
  liczbaPracowników++;
  //Można tak
  this.pesel = pesel;
  this.nazwisko = nazwisko;
  this.wiek = wiek;

 }
 */



 public Pracownik(String imie, String nazwisko) {
  liczbaPracowników++;
  this.imie = imie;
  this.nazwisko = nazwisko;
 }

 public String getImie() {
  return imie;
 }

 public void setImie(String imie) {
  this.imie = imie;
 }

 public String getNazwisko() {
  return nazwisko;
 }

 public void setNazwisko(String nazwisko) {
  this.nazwisko = nazwisko;
 }

 public int getWiek() {
  return wiek;
 }

 public void setWiek(int wiek) {
  if (wiek > 65 || wiek < 18){
   System.out.println("Wiek musi bć pomiędzy 18 i 65, a wprowadziłeś: " + wiek);
  } else {
   this.wiek = wiek;
  }
 }

  //Przesłanianie metod
 public String toString(){
   return "wartość z mojej metody toString: " + this.imie + " " + this.nazwisko + " " + this.wiek
           + " wynagrodzenie: " + "  liczba pracowników: " +  liczbaPracowników;
 }

}
