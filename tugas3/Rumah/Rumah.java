package tugas3.Rumah;

import tugas3.Paintable;

import java.util.Random;

public class Rumah implements Paintable{
    private String color;
    public static int address;
    public static int phoneNumber;
    Random rand = new Random();
    int total = rand.nextInt(10) + 1;

    @Override
    public void paint() {
        if (total < 3){
            color = "blue";
        }
        else if (total < 5){
            color = "red";
        }
        else if (total > 5){
            color = "yellow";
        }
        else {
            color = "black";
        }
    }

    public void renovate(){
        System.out.println("House on block " + address + " is being changed to color " + color);
    }


}
