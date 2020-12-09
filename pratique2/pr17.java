import java.util.*;
public class pr7 {
    
public static void main(String[] args) {
    System.out.println ("Enter a post address ");
    Scanner input =new Scanner(System.in);
    String a  = input.nextLine();
    System.out.println(isValid(a));
    input.close();

}

public static boolean isDigital(String s) throws NumberFormatException {
    try {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
public static boolean isValid(String a)
{
    return (isDigital(a) == true) && (a.length() == 5);
}

}
