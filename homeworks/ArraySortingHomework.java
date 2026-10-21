package homeworks;

public class ArraySortingHomework {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Ascending Order:");
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();
        System.out.println("Descending Order:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                if (numbers[j] > numbers[i]) {
                    temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
                }
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");

        }
    }
}
