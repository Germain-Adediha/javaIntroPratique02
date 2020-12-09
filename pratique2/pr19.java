import java.util.*;
public class pr19 {
    public static void main(String[] args) {
        System.out.println ("Enter first string ");
        Scanner input =new Scanner(System.in);
        String a  = input.nextLine();
        System.out.println ("Enter  second string ");
        String b= input.nextLine();
        System.out.println (isPrefix(a,b));
        System.out.println (isSuffix(a,b));
        input.close();
    }
    public static boolean isSuffix(String a, String b)
    {
        b= b.substring(1);
        return a.endsWith(b);
    }

    public static boolean isPrefix (String a, String b)
    {
        b= b.substring(0, b.length()-1);
        return a.startsWith(b);
    }

}
