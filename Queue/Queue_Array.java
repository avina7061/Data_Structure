package Data_Structure.Queue;
class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is succesffully created with size of: " + size);
    }

    // IsFull
    public boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    // isEmpty
    public boolean isEmpty() {
        return (beginningOfQueue == -1) || (beginningOfQueue == arr.length);
    }

    // Enqueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesffully inserted " + value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesffully inserted " + value + " in the queue");
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Peek
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty!");
            return -1;
        }
    }

    //delete

    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is successfully deleted!");
    }

}

public class Queue_Array {
    public static void main(String[] args) {
QueueArray queue = new QueueArray(3);
queue.enQueue(5);
        queue.enQueue(5);
        queue.enQueue(5);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(5);

    }
}
