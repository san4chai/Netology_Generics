import java.util.Random;

public class MagicBox<T> {
    Random random = new Random();
    T[] items;

    public MagicBox(int x) {
        items = (T[]) new Object[x];
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

    public T pick() throws RuntimeException {
        int emptycell = 0;
        int randomInt = random.nextInt(items.length);
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                emptycell++;
            }
        }
        if (emptycell > 0) {
            throw new RuntimeException("Коробка не полна, осталось заполнить " + emptycell + " ячеек");
        } else {
            return items[randomInt];
        }
    }
}


