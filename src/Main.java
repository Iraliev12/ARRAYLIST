import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sscanner = new Scanner(System.in);
        ArrayList<String>arrayList= new ArrayList<>();
       final int MIN = 0;
        final int MAX = 100;
            System.out.print("Введите длинну массива [N]: ");
            int n = new Scanner(System.in).nextInt();
            int[] array = new Random().ints(n, MIN, MAX + 1).toArray();
            System.out.println(" Mмассив:\n   " + Arrays.toString(array));
            int[] oddArray = Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
            int[] evenArray = Arrays.stream(array).filter(num -> num % 2 != 0).toArray();

            System.out.println("Нечётные элементы:\n   " + Arrays.toString(evenArray));
            System.out.println("Чётные элементы:\n   " + Arrays.toString(oddArray));
        }
    }




