import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Nums_avz {
        public static void main(String[] args) {

            int length = 6;
            int[] nums = new int[length];
            Random random = new Random();

            for (int i = 0; i < length; i++) {
                // заполняем каждый элемент случайным числом от 0 до 99
                nums[i] = random.nextInt(100);
            }

            System.out.println(Arrays.toString(nums));

            // №1 Вывести сумму всех элементов массива
//        int sum = nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5];
//        System.out.println(sum);

            int sum1 = Arrays.stream(nums).sum();
            System.out.println("Сумма: " + sum1);

            //№2 Найти минимальное значение массива
            //вариант 1
//        OptionalInt min = Arrays.stream(nums).min();
            int min = Arrays.stream(nums).min().getAsInt();
            System.out.println("Минимальное значение 2: " + min);

            //вариант 2 - цикл
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }

            System.out.println("Минимальное значение 2: " + min);

            //№3 Найти максимальное значение массива
            //вариант 1
//        OptionalInt max = Arrays.stream(nums).max();
            int max = Arrays.stream(nums).max().getAsInt();
            System.out.println("Максимальное значение 1: " + max);

            //вариант 2 - цикл
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            System.out.println("Максимальное значение 2: " + max);
        }
}


