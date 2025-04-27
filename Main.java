
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // HashTable test
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(100000);
            String name = "Name" + random.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, i);
        }

        int[] chainSizes = table.getChainSizes();
        System.out.println("HashTable chain sizes:");
        for (int i = 0; i < chainSizes.length; i++) {
            System.out.println("Chain " + i + ": " + chainSizes[i] + " elements");
        }

        // BST test
        BST<Integer, String> bst = new BST<>();
        bst.put(5, "five");
        bst.put(3, "three");
        bst.put(7, "seven");
        bst.put(1, "one");
        bst.put(4, "four");

        System.out.println("\nBST entries (in-order traversal):");
        for (var entry : bst) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("BST size: " + bst.size());
    }
}
