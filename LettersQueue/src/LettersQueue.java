import java.util.LinkedList;

public class LettersQueue {
    public static void main(String[] args) {
        LinkedList<String> lettersQ = new LinkedList<String>();

        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");

        System.out.println("Linked List : " + lettersQ);
        System.out.println("Queue Size  : " + lettersQ.size());

        while (!lettersQ.isEmpty())
            System.out.println(lettersQ.removeFirst());
        System.out.println("Linked List : " + lettersQ);
    }
}
