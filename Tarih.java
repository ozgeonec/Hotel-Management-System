import java.util.*;
public class Tarih {
    private int gun,ay,yil;
    private Tarih tarih2;


    public Tarih(int gun, int ay, int yil) {
        int maxgun=30;
        if(ay==2 && yil % 4 == 0 ){
            maxgun=29;
            if(yil % 100 == 0 && yil % 400 != 0){
                maxgun=28;
            }
        }
        if(ay <= 7 && ay % 2 == 1 || ay >= 8 && ay % 2 == 0) {
            maxgun = 31;
            if (gun >= 1 && gun <= maxgun && ay >= 1 && ay <= 12) {
                this.gun = gun;
                this.ay = ay;
                this.yil = yil;
            }
        }else{
            Calendar simdi = Calendar.getInstance();
            this.gun = simdi.get(Calendar.DAY_OF_MONTH);
            this.ay = simdi.get(Calendar.MONTH)+1;
            this.yil = simdi.get(Calendar.YEAR);
        }

    }

    public int getGun() {
        return gun;
    }

    public int getAy() {
        return ay;
    }

    public int getYil() {
        return yil;
    }
    public int digerindenKacGunOnce(Tarih diger){
        int i;
       if(yil < diger.getYil()){
           i = diger.getYil() - yil;
           return i;
       }
       if(yil == diger.getYil() && ay < diger.getAy()){
           i=diger.getAy() - ay;
           return i;
       }
       if(yil == diger.getYil() && ay == diger.getAy() && gun < diger.getGun()){
           i = diger.getGun() - gun;
           return i;
       }
       return 0;
    }
}
