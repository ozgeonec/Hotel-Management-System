public abstract class Kisi {
    private String adSoyad,TCKimlik;

    public Kisi(String ad, String TCKimlik){
        this.adSoyad=adSoyad;

        this.TCKimlik=TCKimlik;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTCKimlik() {
        return TCKimlik;
    }

}
