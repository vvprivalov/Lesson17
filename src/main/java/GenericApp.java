import java.util.Arrays;

public class GenericApp {

    public static void main(String[] args) {

        // Проверка первого метода
        String[] array1 = {"1", "2", "3", "4", "5", "6"};
        System.out.println(Arrays.toString(array1));
        changeElementArray(array1, 2, 4);
        System.out.println(Arrays.toString(array1));


    }


    public static <T> void changeElementArray(T [] array, int a, int b) {

        T interim;

        interim = array[a];
        array[a] = array[b];
        array[b] = interim;

    }
}
