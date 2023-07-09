package queue_interface_program;


import java.util.ArrayDeque;
import java.util.Deque;

public class deque_interface {
    public static void main(String[] args) {
        Deque<Integer> gm = new ArrayDeque<>();
        gm.addLast(10);
        gm.addLast(20);
        gm.addLast(30);
        gm.addLast(40);
        gm.addLast(50);
        gm.addLast(60);
        gm.addLast(70);
        gm.addLast(80);
        System.out.println(gm);
        System.out.println(gm.getFirst());
        System.out.println(gm.getLast());
        System.out.println(gm.pollLast());
        System.out.println(gm.pollFirst());

    }
}
