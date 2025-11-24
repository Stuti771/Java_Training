package lecture4;

public class NoOfVowels {
    public static void main(String[] args) {
        String s="hello";
        int l=s.length();
        int v=0;
        for(char ch : s.toCharArray()){
            if("aeiou".indexOf(ch)!=-1)
                v++;
        }
        System.out.println("String="+s);
        System.out.println("NO of vowels in above string="+v);
        System.out.print("No of consonants in above string="+(l-v));
    }
}
