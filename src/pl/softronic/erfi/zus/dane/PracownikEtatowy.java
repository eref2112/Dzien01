package pl.softronic.erfi.zus.dane;

public class PracownikEtatowy extends Pracownik {
    static float pensjaBazowa = 2000f;
    int staz = 0;
    String wyksztalcenie = "P";
    boolean wZwiazku = true;
    private Float pensja = 0.0f;

    public PracownikEtatowy() {
        //Utils.wyswietl("konstruktor bezparametrowy z klasy etat " + this.getClass().getName());
    }

    public PracownikEtatowy(String imie, String nazwisko, int wiek, int staz, String wyksztalcenie, boolean wZwiazku) {
        super(imie, nazwisko, wiek);
        this.staz = staz;
        this.wyksztalcenie = wyksztalcenie;
        this.wZwiazku = wZwiazku;

        //Można w ten sposób
        //super.imie = imie;
        //super.nazwisko = nazwisko;
        //super.wiek = wiek;
    }

    public PracownikEtatowy(String imie, String nazwisko) {
        super(imie, nazwisko);


        //Można w ten sposób
        //super.imie = imie;
        //super.nazwisko = nazwisko;
        //super.wiek = wiek;
    }

    public void policzPensje(boolean zaszczepiony) {
        this.pensja = this.pensja + 100.f;
    }


    public void policzPensje() {
        if (this.staz < 10) {
            this.pensja = pensjaBazowa + 2000f;
        } else if (staz >= 10 && staz < 25) {
            this.pensja = pensjaBazowa + 3000f;
        } else {
            this.pensja = pensjaBazowa + 6000f;
        }

        if (this.wZwiazku) {
            this.pensja = this.pensja + (this.pensja * 0.1f);
        }

        //Stary switch
        switch (this.wyksztalcenie) {
            case "P":
                this.pensja = this.pensja - this.pensja * 0.1f;
                break;
            case "W":
                this.pensja = this.pensja + this.pensja * 0.2f;

        }

        //Nowy switch
        switch (this.wyksztalcenie) {
            case "P" -> {
                this.pensja = this.pensja - this.pensja * 0.1f;
            }
            case "W" -> this.pensja = this.pensja + this.pensja * 0.2f;
        }
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

    //Przesłanianie metod
    public String toString() {
        return "Pracownik etatowy: " + this.imie + " " + this.nazwisko + " " + this.wiek
                + " wynagrodzenie: " + this.pensja + "  liczba pracowników: " + liczbaPracowników;
    }


}
