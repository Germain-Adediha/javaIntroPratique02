import java.util.*;
/*Создайте функцию, которая принимает массив в качестве аргумента и возвращает
true или false в зависимости от того, является ли среднее значение всех элементов
массива целым числом или нет. */

public class pr13 {
    
public static void main(String[] args) {
System.out.println("Enter the array (Separate numbers by space)");
Scanner input =new Scanner(System.in);
    String str =input.nextLine();
 System.out.println(average(str));

    input.close();
}

    public static boolean average(String a)
    {
        double s = 0;
        String[] items = a.split(" ");
        int[] aa = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            aa[i] = Integer.parseInt(items[i]);
        }

        for (int i=0; i<aa.length; i++)
        {
            s = s + aa[i];
        }
        return s/aa.length % 1 == 0;
    }

}
