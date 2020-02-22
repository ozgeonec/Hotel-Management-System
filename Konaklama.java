public class Konaklama {
    private Tarih giris,cikis;
    private Misafir misafirler[];
    private int misafirSayisi;
    private Oda oda;

    public Konaklama(Tarih giris, Tarih cikis,Oda oda) {
        this.giris = giris;
        this.cikis = cikis;
        misafirler = new Misafir[misafirSayisi];
        this.oda=oda;
        misafirSayisi=100;
    }
    public boolean misafirEkle(Misafir misafir){
        if (misafirSayisi < misafirler.length){
            misafirler[misafirSayisi]= misafir;
            misafirSayisi++;
            return true;
        }
        return false;
    }

    public Tarih getGiris() {
        return giris;
    }

    public Tarih getCikis() {
        return cikis;
    }

    public Misafir kimliktenMisafirBul(String TCKimlik){
        for(int i=0;i<misafirler.length;i++){
            if(TCKimlik == misafirler[i].getTCKimlik()){
                return misafirler[i];
            }
        }
        return null;
    }

    public Misafir isimdenMisafirBul(String adSoyad){
        for(int i=0;i<misafirler.length;i++) {
            if (adSoyad == misafirler[i].getAdSoyad()) {
                return misafirler[i];
            }
        }
        return null;
    }
    public double faturala(Tarih cikis){
        this.cikis=cikis;
        double ucret = oda.getGunlukUcret();
        int gunSayisi = giris.digerindenKacGunOnce(cikis);
        return gunSayisi * ucret;

    }
    public Oda getOda(){
        return oda;
    }
}
