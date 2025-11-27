package lecture8;

// Single-level Inheritance

class book{
    void read(){
        System.out.println("The book is being read");
    }
}
class novel extends book{
    void storyLine(){
        System.out.println("The story of this novel is great");
    }
}
public class Inheritance5 {
    public static void main(String[] args){
        novel n=new novel();
        n.read();
        n.storyLine();
    }
}
