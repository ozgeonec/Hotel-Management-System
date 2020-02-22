public class Misafir extends Kisi {
    private String cepTel,ikamet;


    public Misafir(String cepTel, String ikamet, String adSoyad, String TCKimlik) {
        super(adSoyad,TCKimlik);
        this.cepTel = cepTel;
        this.ikamet = ikamet;

    }

    public String getCepTel() {
        return cepTel;
    }

    public String getIkamet() {
        return ikamet;
    }

}
