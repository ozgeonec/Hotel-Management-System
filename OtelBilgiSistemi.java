public class OtelBilgiSistemi {
    private Personel calisanlar[];
    private Oda odalar[];
    private Konaklama konaklamalar[];
    private int calisanSayisi;
    private int odaSayisi;
    private int konaklamaSayisi;

    public OtelBilgiSistemi(int calisanSayisi, int odaSayisi, int konaklamaSayisi) {
        this.calisanSayisi = calisanSayisi;
        this.odaSayisi = odaSayisi;
        this.konaklamaSayisi = konaklamaSayisi;
        calisanlar= new Personel[calisanSayisi];
        odalar = new Oda[odaSayisi];
        konaklamalar = new Konaklama[konaklamaSayisi];
    }
    public Oda odaBul(int no){
        for(int i=0;i<odalar.length;i++){
            if(odalar[i].getNo()==no){
                return odalar[i];
            }
        }
        return null;
    }
    public Oda kapasitedeOdaBul(int kapasite){
        Oda uygunOda = new Oda(9999, kapasite+100);
        for(int i =0;i<odalar.length;i++){
            if(odalar[i].getKalanKisiSayisi() == 0
                    && odalar[i].getKapasite() < uygunOda.getKapasite()
                           && odalar[i].getKapasite()>=kapasite){
                uygunOda = odalar[i];

            }
        }
        if(uygunOda.getNo()== 9999) return null;
        return uygunOda;
    }
    public void misafirYerlestir(int odaNo){
        for(int i=0;i<konaklamalar.length;i++){
            if(konaklamaSayisi < konaklamalar.length && konaklamalar[i].getOda().getNo()==odaNo){
                konaklamaSayisi++;
            }
        }
    }

    public int getKonaklamaSayisi() {
        return konaklamaSayisi;
    }


    public Misafir isimliMisafirBul(String adSoyad){
        for(int i = 0;i<konaklamalar.length;i++){
            return konaklamalar[i].isimdenMisafirBul(adSoyad);
        }
        return null;
    }


    public Misafir kimlikliMisafirBul(String TCKimlik){
        for(int i = 0;i<konaklamalar.length;i++){
            return konaklamalar[i].kimliktenMisafirBul(TCKimlik);
        }
        return null;
    }

    public double odaFaturala(int odaNo){
        for(int i=0;i<konaklamalar.length;i++) {
            if (konaklamalar[i].getOda().getNo() == odaNo) {
                Tarih cikisTarihi = konaklamalar[i].getCikis();
                double fatura = konaklamalar[i].faturala(cikisTarihi);
                return fatura;
            }
        }
        return -1.0;
    }
}
