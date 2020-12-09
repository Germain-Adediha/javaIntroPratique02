import java.util.*;
public class pr20 {
    
public static void main(String[] args) {
    System.out.println ("Enter your step ");
    Scanner input =new Scanner(System.in);
    int a  = input.nextInt();
    System.out.println(boxSeq(a));
    input.close();
}
    
    public static int boxSeq(int n)
    {
        if (n%2==0) {return 3*n/2-n/2;}
        else {return 3*(n/2+1)-n/2;}
    }
}
