import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[10];

        for(int i  = 0; i < numbers.length;  i++)

            numbers[i] = rand.nextInt(100);

        String arrayString= Arrays.toString(numbers);
        System.out.println(arrayString + "\n");


        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        average = (double) sum / (numbers.length);

        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + average);

        int minSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                minSum = minSum + numbers[i];
            }
        }

        int maxSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                maxSum = maxSum + numbers[i];
            }
        }

        System.out.println("Oblicz i wyświetl sumę liczb mniejszych od średniej: " + minSum);
        System.out.println("Oblicz i wyświetl sumę liczb większych od średniej: " + maxSum);


    }


}
