package tugas3.Rumah;

public class AmmetVille extends Rumah{
    private int ghost;

    public void kill(){
        System.out.println("People from block " + getAddress() + " is being killed by " + getGhost() + " ghost");
    }
    public void spook(){
        System.out.println("People from block " + getAddress() + " is being haunted by " + getGhost() + " ghost");
    }
    public void setGhost(int val) {
        this.ghost = val;
    }

    public int getGhost() {
        return ghost;
    }

    public void setAddress(int val){
        address = val;
    }
    public int getAddress(){
        return address;
    }
    public void setPhoneNumber(int val){
        phoneNumber = val;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
