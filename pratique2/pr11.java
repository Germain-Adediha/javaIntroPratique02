import java.util.Scanner;


//Создайте функцию, которая повторяет каждый символ в строке n раз


public class pr11{

public static void main(String[] args) {
    System.out.println("Enter a word");
		Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println("Enter N");
        int n =in.nextInt();
        System.out.println(repeat(word,n));
        in.close();
}

public static String repeat(String a, int b)
    {
        String s = "";
        char[] HA = a.toCharArray();
        for (int i = 0; i< a.length(); i++)
        {
            for (int j=0; j<b; j++)
            {
                s = s + HA[i];
            }
        }
        return s;
    }
    
}