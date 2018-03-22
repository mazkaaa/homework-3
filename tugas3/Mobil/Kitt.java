package tugas3.Mobil;

public class Kitt extends Mobil{
    private int bullet;
    Dellorean dellorean = new Dellorean();

    public void setBullet(int val) {
        this.bullet = val;
    }

    public int getBullet() {
        return bullet;
    }

    public void shoot(){
        System.out.println(dellorean.getNama() + " is shooting with currently " + getBullet() + " ammo");
    }
    public void Speak(){
        System.out.println(dellorean.getNama() + " want to speak to you!");
    }
}
