import java.util.*;
public class pr5 {
    /*Создайте функцию, которая возвращает число десятичных знаков, которое имеет
число (заданное в виде строки). Любые нули после десятичной точки
отсчитываются в сторону количества десятичных знаков. */
public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner input =new Scanner(System.in);
    String str = input.nextLine();
    System.out.println(getDecimalPlaces(str));
    input.close();
}
    public static int getDecimalPlaces(String a){
        return  a.length() - (a.indexOf('.')+1);
    }


}
