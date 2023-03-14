package Queue;

//queue using array
public class QueueB {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int size) {
            Queue.size = size;
            arr = new int[size];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            arr[++rear] = data;
        }

        // O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        System.out.println(Queue.remove());
        System.out.println(Queue.peek());
    }
}
