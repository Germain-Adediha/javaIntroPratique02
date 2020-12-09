import java.util.*;
public class pr14 {
    public static void main(String[] args) {
        System.out.println("Enter the array (Separate numbers by space)");
Scanner input =new Scanner(System.in);
    String str =input.nextLine();
 System.out.println(cumulativeSum(str));
        input.close();
    }
    public static String cumulativeSum(String a)
    {
        //Ввод массива
        String[] items = a.split(" ");
        int[] aa = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            aa[i] = Integer.parseInt(items[i]);
        }

        //variable de sortie
        String st = "";

        //cycle principale du programme
        for (int i=0; i< aa.length; i++)
        {
            int s=0;
            for (int j=0; j< i+1; j++)
            {
                s=s+aa[j];
            }
            st = st + s + " ";
        }

        return st;

    }
}
