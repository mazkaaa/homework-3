package tugas3.Mobil;

import java.util.Random;

public class Dellorean extends Mobil{

    public void targetTime(){
        Random rand = new Random();
        System.out.println(getNama() + " [" + getMerk() + "] " +"is targeting time on " + rand.nextInt(100) + 50 + " second");
    }
    public void Fly(){
        System.out.println(getNama() + " [" + getMerk() + "] " + "is flying");
    }

    public void setNama(String string) {
        Nama = string;
    }

    public String getNama() {
        return Nama;
    }

    public void setMerk(String string) {
        Merk = string;
    }

    public String getMerk() {
        return Merk;
    }

    public void setCcMesin(int val) {
        this.ccMesin = val;
    }

    public int getCcMesin() {
        return ccMesin;
    }
}
