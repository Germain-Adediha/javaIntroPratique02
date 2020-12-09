import java.util.*;
public class pr16 {
   /* Создайте функцию, которая при заданном числе возвращает соответствующее
число Фибоначчи.*/
public static void main(String[] args) {
    System.out.println ("Gettig Fibonacci number . Enter a number  ");
    Scanner input =new Scanner(System.in);
    int a  = input.nextInt();
    System.out.println(Fibonacci(a));
    input.close();
}
public static int Fibonacci(int a) {
    int a1 = 1;
    int a2 = 1;

    for (int i = 2; i < a+1; i++) {
        if (i%2==1){
        a1 = a1 + a2;}
        else{
        a2 = a1 + a2;}
    }
    if (a % 2 == 0) {
        return a2;
    }
    else {
        return a1;
    }
}
}
