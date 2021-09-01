public class BoxApp {

    public static void main(String[] args) {
        // создание объектов Апельсин
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        // Создание объектов Яблоко
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        // Создаем коробку для хранения апельсинов и складываем их в коробку
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addToBox(orange1);
        orangeBox.addToBox(orange2);
        orangeBox.addToBox(orange3);

        // Создаем коробку для хранения яблок и складываем яблоки в коробку
        Box<Apple> appleBox = new Box<>();
        appleBox.addToBox(apple1);
        appleBox.addToBox(apple2);
        appleBox.addToBox(apple3);

        // Вывод значений
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
    }
}
