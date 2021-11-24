package pl.softronic.erfi.zus.dane;

/*
Budowanie klasy "rozszerzającej klasę Pracownik" przez wstawianie obiektu klasy Pracownik
Czasam  nie ma wyjścia i trzeba w taki sposób (z powodu niemożliwości wielokrotnego dziedzidzenia)
 */
public class PracownikEtatowyHasA {
    //Wstawiony (zadeklarowany) Pracownik;
    public Pracownik pracownik = null;


    static float pensjaBazowa = 2000f;
    int staz = 0;
    public String wyksztalcenie = "P";
    boolean wZwiazku = true;
    private Float pensja = 1000.0f;

    public PracownikEtatowyHasA(){
        pracownik = new PracownikKlasaPomocnicza();
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public static float getPensjaBazowa() {
        return pensjaBazowa;
    }

    public static void setPensjaBazowa(float pensjaBazowa) {
        PracownikEtatowyHasA.pensjaBazowa = pensjaBazowa;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public String getWyksztalcenie() {
        return wyksztalcenie;
    }

    public void setWyksztalcenie(String wyksztalcenie) {
        this.wyksztalcenie = wyksztalcenie;
    }

    public boolean iswZwiazku() {
        return wZwiazku;
    }

    public void setwZwiazku(boolean wZwiazku) {
        this.wZwiazku = wZwiazku;
    }

    public Float getPensja() {
        return pensja;
    }

    private void setPensja(Float pensja) {
        this.pensja = pensja;
    }
}
