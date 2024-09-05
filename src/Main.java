import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        // System.out.println(scanner.nextInt() % 2 == 0 ? "Число чётное" : "Число нечётное");

        // Задача 2
        //System.out.println("Минимальное из введёных чисел: " + Integer.min(Integer.min(scanner.nextInt(), scanner.nextInt()), scanner.nextInt()));

        // Задача 3
        //IntStream.rangeClosed(1, 10).forEach(i -> System.out.println("5 * " + i + " = " + (5 * i)));

        // Задача 4
        //System.out.println(IntStream.rangeClosed(1, scanner.nextInt()).sum());

        // Начиная с этой задачи моё стремление решать всё в одну строку сильно подугасло...
        // Задача 5
        //int[] fib = {0, 1};
        //int temp, N = scanner.nextInt();
        //for (int i = 2; i < N; i++) {
        //    temp = fib[1];
        //    fib[1] = fib[0] + fib[1];
        //    fib[0] = temp;
        //}
        //System.out.println(N == 1 ? 0 : fib[1]);

        // Задача 6
        //System.out.println(isPrime(scanner.nextInt()) ? "Число простое" : "Число не простое");

        // Задача 7
        //int N = scanner.nextInt();
        //int step = N > 1 ? -1 : 1; // Нужно чтобы задача работала для отрицательных чисел
        //for (int i = N; i != 1; i += step)
        //{
        //    System.out.println(i);
        //}
        //System.out.println(1); // :)

        // Задача 8
        //System.out.println(IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt()).filter(i -> i % 2 == 0).sum());

        // Задача 9
        //System.out.println(new StringBuilder(scanner.next()).reverse());

        // Задача 10
        //System.out.println(String.valueOf(scanner.nextInt()).length());

        // Задача 11
        //int fN = 1, N = scanner.nextInt();
        //for (int i = 1; i <= N; i++)
        //{
        //    fN *= i;
        //}
        //System.out.println(fN);

        // Задача 12
        //int sum = 0;
        //for (char digit : scanner.next().toCharArray()) {
        //    sum += Character.getNumericValue(digit);
        //}
        //System.out.println("Сумма цифр числа: " + sum);

        // Задача 13
        //String s = scanner.next();
        //String rS = new StringBuilder(s).reverse().toString();
        //System.out.println(s.equals(rS) ? "Строка является палиндромом." : "Строка не является палиндромом");

        // Задача 14
        //int[] nums = new int[scanner.nextInt()];
        //for (int i = 0; i < nums.length; i++) {
        //    nums[i] = scanner.nextInt();
        //}
        //System.out.println("Максимальное число в массиве: " + IntStream.of(nums).max().getAsInt());

        // Задача 15
        //int[] nums = new int[scanner.nextInt()];
        //for (int i = 0; i < nums.length; i++) {
        //    nums[i] = scanner.nextInt();
        //}
        //System.out.println("Сумма всех элементов массива: " + Arrays.stream(nums).sum());

        // Задача 16
        //int[] nums = new int[scanner.nextInt()];
        //for (int i = 0; i < nums.length; i++) {
        //    nums[i] = scanner.nextInt();
        //}
        //System.out.println("Количество положительных чисел: " + IntStream.of(nums).filter(i -> i > 0).toArray().length);
        //System.out.println("Количество отрицательных чисел: " + IntStream.of(nums).filter(i -> i < 0).toArray().length);

        // Задача 17
        //IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt()).forEach(i -> System.out.println(isPrime(i) ? "Число простое" : "Число не простое"));

        // Задача 18
        //String s = scanner.next();
        //int vowelsCount = 0, consonantsCount = 0;
        //
        //String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";
        //for (char c : s.toCharArray())
        //{
        //    if (Character.isLetter(c))
        //    {
        //        if (vowels.indexOf(c) >= 0) vowelsCount++;
        //        else consonantsCount++;
        //    }
        //}
        //
        //System.out.println("Количество гласных: " + vowelsCount);
        //System.out.println("Количество согласных: " + consonantsCount);

        // Задача 19
        //String s = scanner.nextLine();
        //String[] words = s.split(" ");
        //StringBuilder yodaSpeech = new StringBuilder();
        //
        //for (int i = words.length - 1; i >= 0; i--) {
        //    yodaSpeech.append(words[i]).append(" ");
        //}
        //System.out.println("Строка в стиле Йоды: " + yodaSpeech.toString().trim());

        // Задача 20
        //int num = scanner.nextInt();
        //int originalNum = num;
        //int sum = 0;
        //int digits = String.valueOf(num).length();
        //
        //while (num != 0)
        //{
        //    int digit = num % 10;
        //    sum += Math.pow(digit, digits);
        //   num /= 10;
        //}
        //System.out.println(sum == originalNum ? "Число является числом Армстронга." : "Число не является числом Армстронга.");
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1) return false;

        for (int i = 2; i < Math.sqrt(n); i++) if (n % i == 0) return false;

        return true;
    }
}

