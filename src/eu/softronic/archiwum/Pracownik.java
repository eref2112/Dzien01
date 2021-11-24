package eu.softronic.archiwum;

public class Pracownik {
  static public int liczbaPracowników = 0;

  String imie = "Jan";
  String nazwisko = "Kowalski";
  int wiek = 0;
  float pensja = 0.0f;
  int staz = 0;

 public Pracownik() {
  liczbaPracowników++;

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

 public float getPensja() {
  return pensja;
 }

 private void setPensja(float pensja) {
  this.pensja = pensja;
 }

 public int getStaz() {
  return staz;
 }

 public void setStaz(int staz) {

  //wywołujemy metodę ustawiającą wartość pensji
  wyliczPensjeBezZwracaniaWartosci(staz);
  /*
  if (staz < 10) {
   this.pensja = 2000f;
  } else if (staz >= 10 && staz < 25) {
   this.pensja = 3000f;
  } else {
   this.pensja = 6000f;
  }
  */
  this.staz = staz;
 }

 private void wyliczPensjeBezZwracaniaWartosci(int staz) {
  float pensja = 0f;

  if (staz < 10) {
   this.pensja = 2000f;
  } else if (staz >= 10 && staz < 25) {
   this.pensja = 3000f;
  } else {
   this.pensja = 6000f;
  }
 }

 private float wyliczPensjeZeZwaracaniemWartosci(int staz) {
  float pensja = 0f;

  if (staz < 10) {
   pensja = 2000f;
  } else if (staz >= 10 && staz < 25) {
   pensja = 3000f;
  } else {
   pensja = 6000f;
  }

  return pensja;
 }

 //Przesłanianie metod
 public String toString(){
   return "wartość z mojej metody toString: " + this.imie + " " + this.nazwisko + " " + this.wiek
           + " wynagrodzenie: " + this.pensja + "  liczba pracowników: " + liczbaPracowników;
 }

}
