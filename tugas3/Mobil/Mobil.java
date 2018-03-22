package tugas3.Mobil;

public class Mobil {
    public static String Nama;
    public static String Merk;
    public static int ccMesin;

    public void move(){
        Dellorean dellorean = new Dellorean();
        System.out.println(dellorean.getNama() + " [" + dellorean.getMerk() + "] " + "is moving using " + dellorean.getCcMesin() + "cc's engine");
    }


}
