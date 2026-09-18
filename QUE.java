public class QUE {
    static class Queue{
        int arr[];
        int size;
        int front;
        int rear;
        
        public Queue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }
        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public void add(int data){
            if((rear + 1) % size == front){
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()){
                front = 0;
                rear = 0;
                arr[rear] = data;
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return removed;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}