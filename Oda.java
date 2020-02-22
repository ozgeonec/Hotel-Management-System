public class Oda {
    private final int no,kapasite;
    private int kalanKisiSayisi;
    private double gunlukUcret;
    private Personel sorumlu;




    public Oda(int no, int kapasite) {
        this.no = no;
        this.kapasite = kapasite;
        this.kalanKisiSayisi = kalanKisiSayisi;
        this.gunlukUcret = gunlukUcret;
        this.sorumlu = sorumlu;
    }

    public Personel getSorumlu() {
        return sorumlu;
    }

    public void setSorumlu(Personel sorumlu) {
        this.sorumlu = sorumlu;
    }

    public int getKalanKisiSayisi() {
        return kalanKisiSayisi;
    }

    public void setKalanKisiSayisi(int kalanKisiSayisi) {
        this.kalanKisiSayisi = kalanKisiSayisi;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public int getNo() {
        return no;
    }

    public int getKapasite() {
        return kapasite;
    }


}
