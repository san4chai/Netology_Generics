public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<String>(3);
        box1.add("Petr");
        box1.add("Olga");
        box1.pick();
    }
}
