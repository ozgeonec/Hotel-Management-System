public class Personel extends Kisi {
    private final int sicilNo;
    Tarih tarih = new Tarih(1,1,2020);

    public Personel(int sicilNo,String adSoyad,String TCKimlik) {
        super(adSoyad,TCKimlik);
        this.sicilNo = sicilNo;
    }
    public int getSicilNo(){
        return sicilNo;
    }
}
