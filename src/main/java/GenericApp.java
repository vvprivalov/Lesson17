import java.util.Arrays;
import java.util.List;

public class GenericApp {

    public static void main(String[] args) {

        // Проверка первого метода
        String[] array1 = {"Один", "Два", "Три", "Четыре", "Пять", "Шесть"};
        System.out.println(Arrays.toString(array1));
        changeElementArray(array1, 2, 4);
        System.out.println(Arrays.toString(array1));

        // Проверка второго метода
        String[] arrayStr = {"Один", "Два", "Три", "Четыре", "Пять"};
        List arraylist = arrayToArrayList(arrayStr);
        System.out.println(arraylist);
    }


    public static <T> void changeElementArray(T[] array, int a, int b) {

        T interim;

        interim = array[a];
        array[a] = array[b];
        array[b] = interim;

    }

    public static <T> List<T> arrayToArrayList(T[] array) {
        return Arrays.asList(array);
    }
}
