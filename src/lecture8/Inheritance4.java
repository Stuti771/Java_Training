package lecture8;

// Multi-level Inheritance

class device{
    void powerOn(){
        System.out.println("Device is on");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("Laptop is booting");
    }
}
class gamingLaptop extends laptop{
    void startGame(){
        System.out.println("Game has started");
    }
}
public class Inheritance4 {
    public static void main(String[] args){
        gamingLaptop g=new gamingLaptop();
        g.powerOn();
        g.boot();
        g.startGame();
    }
}
