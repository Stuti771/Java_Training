package lecture5;

public class CompressString {
    public static void main(String[] args) {
        String s="aabbcab";
        int l=s.length();
        System.out.println("String = "+s);
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=0;i<l-1;i++) {
            if (s.charAt(i) == s.charAt(i+1))
                count++;
            else {
                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        result.append(s.charAt(l-1)).append(count);
        System.out.println("Compressed string = "+result);
    }
}
