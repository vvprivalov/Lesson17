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
        Apple apple4 = new Apple();


        // Создаем коробку для хранения апельсинов и складываем их в коробку
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addToBox(orange1);
        orangeBox.addToBox(orange2);
        orangeBox.addToBox(orange3);

        // Создаем коробку для хранения яблок и складываем яблоки в коробку
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addToBox(apple1);
        appleBox1.addToBox(apple2);
        appleBox1.addToBox(apple3);

        // Создаем вторую коробку для хранения яблок и складываем яблоки в коробку
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addToBox(apple1);
        appleBox2.addToBox(apple2);
        appleBox2.addToBox(apple3);
        appleBox2.addToBox(apple4);


        // Вывод значений
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(orangeBox));

        // Проверка метода Пересыпания фруктов из ящика в ящик
        appleBox1.intersperseBox(appleBox2);
        System.out.println(appleBox1);
        System.out.println(appleBox2);
    }
}
