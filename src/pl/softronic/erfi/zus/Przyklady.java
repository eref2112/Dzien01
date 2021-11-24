package pl.softronic.erfi.zus;

public class Przyklady {


    public static String powitanieStatyczne = " Powitanie statyczne";
    private String powitanie = "Cześć";

    void powitaj(){
        System.out.println(powitanie);
    }

    String getPowitanie()
    {
        return powitanie;
    }

    void setPowitanie(String nowa){
        powitanie = nowa;
    }

}
