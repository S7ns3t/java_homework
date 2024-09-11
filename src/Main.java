import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.IntStream;
import java.time.LocalDate;


public class Main
{
    public static void main(String[] args) throws Exception
    {
    }
    
    // Задача 1
    public static int maxOfTwo(int a, int b) throws Exception
    {
        if (a > b) return a;
        else if (b > a) return b;
        else throw new Exception("Числа равны");
    }
    
    // Задача 2
    public static double div(double a, double b) throws ArithmeticException
    {
        if (b != 0) return a / b;
        throw new ArithmeticException("Попытка деления на ноль");
    }
    
    // Задача 3
    public static int intFromString(String convertableString) throws NumberFormatException
    {
        try
        {
            return Integer.parseInt(convertableString);
        }
        catch (Exception e)
        {
            throw new NumberFormatException("Данную строку нельзя конвертировать в число");
        }
    }
    
    // Задача 4
    public static void ageCheck(int age) throws IllegalArgumentException
    {
        if (age < 0 || age > 150) throw new IllegalArgumentException("Некорректный возраст");
    }
    
    // Задача 5
    public static double getRoot(double a) throws IllegalArgumentException
    {
        if (a < 0) throw new IllegalArgumentException("Отрицательное число");
        return Math.sqrt(a);
    }
    
    // Задача 6
    public static int getFactorial(int a) throws Exception
    {
        if (a < 0) throw new Exception("Отрицательное число");
        return IntStream.rangeClosed(1, a).reduce(1, (int x, int y) -> x * y);
    }
    
    // Задача 7
    public static void nullsCheck(int[] nums) throws Exception
    {
        for (int n : nums) if (n == 0) throw new Exception("Найден 0");
    }
    
    // Задача 8
    public static int pow(int a, int b) throws Exception
    {
        if (b < 0) throw new Exception("Отрицательная степень");
        return (int)Math.pow(a, b);
    }
    
    // Задача 9
    public static String sliceString(String s, int endIndex) throws Exception
    {
        if (endIndex > s.length()) throw new Exception("Кол-во символов больше длины строки");
        return s.substring(0, endIndex);
    }
    
    // Задача 10
    public static <T> void checkForN(T[] array, T target) throws Exception
    {
        for (T el : array) if (el == target) return;
        throw new Exception("Элемент не найден");
    }
    
    // Задача 11
    public static String intToBinary(int a) throws Exception
    {
        if (a < 0) throw new Exception("Число отрицательное");
        return Integer.toBinaryString(a);
    }
    
    // Задача 12
    // Это же копия второй задачи..
    public static double div2(double a, double b) throws ArithmeticException
    {
        if (b != 0) return a / b;
        throw new ArithmeticException("Попытка деления на ноль");
    }
    
    // Задача 13
    public static <T> T getElementAtIndex(List<T> list, int i)
    {
        if (i < 0 || i >= list.size()) throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
        return list.get(i);
    }
    
    // Задача 14
    public void passwordCheck(String pwd) throws Exception
    {
        if (pwd.length() < 8) throw new Exception("Длина пароля менее 8 символов");
    }
    
    // Задача 15
    public static void dateCheck(String date) throws Exception
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate.parse(date, formatter);
    }
    
    // Задача 16
    public static String concatTwoStrings(String a, String b) throws NullPointerException
    {
        if (a == null || b == null) throw new NullPointerException("Одна из строк равна null");
        return a + b;
    }
    
    // Задача 17
    public static double remnant(double a, double b) throws ArithmeticException
    {
        if (b != 0) return a % b;
        throw new ArithmeticException("Попытка деления на ноль");
    }
    
    // Задача 18
    public static double getSquareRoot(double a) throws IllegalArgumentException
    {
        if (a < 0) throw new IllegalArgumentException("Отрицательное число");
        return Math.sqrt(a);
    }
    
    // Задача 19
    public static double celsiusToFahrenheit(double C) throws Exception
    {
        if (C < -273.15) throw new Exception("Температура ниже абсолютного нуля");
        return (C * 9 / 5) + 32;
    }
    
    // Задача 20
    public static void stringCheck(String s) throws Exception
    {
        if (s == null || s.isEmpty()) throw new Exception("Строка пустая или null");
    }
}

