package lecture1;

public class CheckChar {
    public static void main(String[] args){
        char c='y';
        System.out.println("Character : "+c);
        switch(c){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : System.out.println("The above char is a VOWEL");
                       break;
            default : System.out.println("The above char is a CONSONANT");
        }
    }
}
