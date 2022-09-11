package linkedList;

import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.show();
    }
}
