import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    Random random = new Random();

    public MagicBox(int maxQuantity) {
        this.items = (T[]) new Object[maxQuantity];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T Pick() throws Exception {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Необходимо заполнить" + " " + (items.length - i) + " " + "ячеек");
            }
            int randomInt = random.nextInt(items.length);
        }
        return items[random.nextInt(3)];

    }
}

