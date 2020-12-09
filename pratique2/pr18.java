import java.util.*;
public class pr18 {

    public static void main(String[] args) {
        System.out.println ("Enter first string ");
        Scanner input =new Scanner(System.in);
        String a  = input.nextLine();
        System.out.println ("Enter  second string ");
        String b= input.nextLine();
        System.out.println (isStrangePair(a, b));
        input.close();
    }
    public  static boolean isStrangePair(String aa, String bb)
    {
        String[] a = aa.split("");
        String[] b = bb.split("");
        return (a[0].equals(b[b.length - 1])) && (b[0].equals(a[a.length - 1]));

    }
}
