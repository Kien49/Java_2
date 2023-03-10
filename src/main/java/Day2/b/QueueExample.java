package Day2.b;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // co 10 tin nhan cung gui vao he thong
        // He thong xu lt 3s/1tin
        // De luu tru duoc cac tin nhan tren -> dua vao hang doi
        // Giong ngta xep hang mua do
        Queue<Message> queue = new ArrayDeque<>();
        queue.add(new Message(1, "msg1"));
        queue.add(new Message(2, "msg2"));
        queue.add(new Message(3, "msg3"));
        queue.add(new Message(4, "msg4"));
        queue.add(new Message(5, "msg5"));
        queue.add(new Message(6, "msg6"));
        queue.add(new Message(7, "msg7"));
        queue.add(new Message(8, "msg8"));
        queue.add(new Message(9, "msg9"));
        queue.add(new Message(10, "msg10"));

        while(!queue.isEmpty()){
            Message msg = queue.poll();
            System.out.println(msg);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
