package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {
        int count = 0;
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == 6) {
                count++;
            }
        }
        System.out.println("Count of 6: " + count);
        System.out.println();
        int[] nums = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
            for (int i = 0; i < nums.length / 2; i++) {
                int tmp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = tmp;
            }
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        int[] numbs = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatedNumbers = 0;
        for (int i = 0; i < numbs.length; i++) {
            count = 0;
            for (int j = 0; j < i; j++) {
                if (numbs[i] == numbs[j]) {
                    count = -1;
                    break;
                }
            }

            if (count != -1) {
                for (int j = i + 1; j < numbs.length; j++) {
                    if (numbs[i] == numbs[j]) {
                        count++;
                    }
                }

                if (count > 0) {
                    repeatedNumbers++;
                }
            }
        }

        System.out.println("Repeated numbers count: " + repeatedNumbers);
        System.out.println();
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' ||
                    chars[i] == 'է' || chars[i] == 'ը' ||
                    chars[i] == 'ի' || chars[i] == 'ո' ||
                    chars[i] == 'օ') {
                count++;
            }
        }
        System.out.println("Vowels count: " + count);
    }
}
