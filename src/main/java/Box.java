import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> listBox;
    private float weightFruit;

    public Box() {

        this.listBox = new ArrayList<>();

    }

    public void addToBox(T fruit) {
        weightFruit = fruit.getWeightFruit();
        listBox.add(fruit);
    }

    @Override
    public String toString() {
        return "Box{" +
                "listBox=" + listBox +
                '}';
    }

    public float getWeight() {

        return listBox.size() * weightFruit;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {

        return this.getWeight() == otherBox.getWeight();
    }

    public void intersperseBox(Box<? extends T> otherBox) {
        this.listBox.addAll(0, otherBox.listBox);
        otherBox.listBox.clear();

    }
}
