package lecture6;

public class NonRepeatingChar {
    void val(String s,int freq[]){
        for(char a:s.toCharArray())
            freq[a]++;
        for(int i=0;i<256;i++){
            if(freq[i]==1){
                System.out.print((char)i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabbdc";
        int freq[] = new int[256];
        NonRepeatingChar n=new NonRepeatingChar();
        n.val(s,freq);
    }
}
