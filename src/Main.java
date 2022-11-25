public class Main {

    public static void main(String[] args) throws Exception {
        MagicBox<String> magicBox = new MagicBox<>(3);
        MagicBox<Integer> magicBox2 = new MagicBox<>(3);

        System.out.println(magicBox.add("Mobail"));
        System.out.println(magicBox.add("Book"));
        System.out.println(magicBox.add("Ball"));
        System.out.println(magicBox.add("Money"));

        System.out.println(magicBox.Pick());
        System.out.println();

        System.out.println(magicBox2.add(1));
        System.out.println(magicBox2.add(2));
        System.out.println(magicBox2.add(3));
        System.out.println(magicBox2.add(4));

        System.out.println(magicBox2.Pick());
    }
}
