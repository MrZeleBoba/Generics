
import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int maxQuantity;

    public MagicBox(int maxQuantity) {
        T[] items = (T[]) new Object[maxQuantity];
        this.items = items;
        this.maxQuantity = maxQuantity;
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


        }
        Random random = new Random();
        int randomInt = random.nextInt(maxQuantity);
        return items[randomInt];

    }




    }








