package homeworks;
public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("First element" + " = " + numbers[0]);
        System.out.println("Last element" + " = " + numbers[numbers.length - 1]);
        System.out.println("Array lenght:" + " " + numbers.length);
        System.out.println();
        int min = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (min > numbers[j]) {
                min = numbers[j];
            }
        }
        System.out.println("Minimum number:" + min);
        System.out.println();
        System.out.println("Middle elements: " + numbers.length);
        System.out.println();
        int cout = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                cout++;
            }
        }
        System.out.println("Even numbers count: " + cout);
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                cout++;
            }
        }
        System.out.println("Odd numbers count: " + cout);
        System.out.println();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum " + "= " + sum);
        System.out.println();
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}