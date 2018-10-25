public class QueueImpl {

    public static void main(String args[]){

        MyCircularQueue q1 = new MyCircularQueue(3);
        q1.enQueue(1);
        System.out.println(q1.head);
        System.out.println(q1.tail);
        q1.deQueue();

    }
}
