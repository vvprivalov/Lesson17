import java.util.ArrayList;

public class Box <T extends Fruit>{
    private final ArrayList<T> listBox;
    private float weightFruit;

    public Box() {

        this.listBox = new ArrayList<>();

    }

    public void addToBox(T fruit) {
        if (fruit instanceof Apple) {
            weightFruit = fruit.getWeightFruit();
        } else {
            weightFruit = fruit.getWeightFruit();
        }
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

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }
}
