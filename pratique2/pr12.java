import java.util.Scanner;

/*Создайте функцию, которая принимает массив и возвращает разницу между
самыми большими и самыми маленькими числами*/

public class pr12 {
    public static void main(String[] args) {
        System.out.println("Enter the  array");
      /*  System.out.print("L = ");
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		
        System.out.println("Enter the values of the array");
        
        int array[];
		array = new int[l];
		for (int i = 0; i < l; i++)
		{
    	array[i] = input.nextInt();
        }*/
        Scanner input = new Scanner(System.in);
		String l = input.nextLine();
        input.close();
int result = DifMaxMin(l);
System.out.println(result);
    }
    
    public static int DifMaxMin(String st) 
    {
        String[] items = st.split(" ");
        int[] a = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            a[i] = Integer.parseInt(items[i]);
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max - min;
    }
}
