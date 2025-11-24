package lecture4;

public class Anagrams {
    public static void main(String[] args) {
        String s1="abcdcaa";
        int l1=s1.length();
        String s2="abadcca";
        int l2=s2.length();
        System.out.println("String 1="+s1);
        System.out.println("String 2="+s2);
        if(l1!=l2)
            System.out.println("The above strings are not anagrams");
        else{
            int f1[]=new int[256];
            for(char ch : s1.toCharArray())
                f1[ch]++;
            int f2[]=new int[256];
            for(char ch : s2.toCharArray())
                f2[ch]++;
            int i;
            for(i=0;i<256;i++){
                if(f1[i]!=f2[i])
                    break;
            }
            if(i<256)
                System.out.println("The above strings are not anagrams");
            else
                System.out.println("The above strings are anagrams");
        }
    }
}
