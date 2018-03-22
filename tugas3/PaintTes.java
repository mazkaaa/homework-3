package tugas3;


import tugas3.Mobil.Dellorean;
import tugas3.Mobil.Kitt;
import tugas3.Rumah.AmmetVille;

import java.util.Random;

public class PaintTes {

    public static void main(String args[]){
        Random rand = new Random();
        Dellorean dello = new Dellorean();
        Kitt kitt = new Kitt();
        AmmetVille ville = new AmmetVille();
        dello.setNama("john");
        dello.setCcMesin(rand.nextInt(1000) + 10);
        dello.setMerk("Audi");
        dello.move();
        delay();
        dello.targetTime();
        delay();
        dello.Fly();
        delay();

        kitt.setBullet(rand.nextInt(100) + 10);
        kitt.Speak();
        delay();
        kitt.shoot();
        delay();

        ville.setAddress(rand.nextInt(99) + 10);
        ville.setGhost(rand.nextInt(10) + 1);
        ville.setPhoneNumber(rand.nextInt(1999) + 1000);
        ville.spook();
        delay();
        ville.paint();
        ville.renovate();
        delay();
        ville.kill();


    }



    public static void delay(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
