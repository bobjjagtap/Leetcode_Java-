public class Queues {
    static int size;
    static int rare=-1;
    static int arr[];
    Queues(int n){
        arr=new int[n];
        size=n;
        rare=-1;
    }
    public boolean isEmpty(){
        return rare ==-1;
    }
    public void add(int data){
        if(rare==size-1){
            System.out.println("Queue is full");
            return;
        }
        rare=rare+1;
        arr[rare]=data;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("is empty");
            return -1;
        }
        int front=arr[0];
        for (int i = 0; i < rare; i++) {
            arr[i]=arr[i+1];
        }
        rare=rare-1;
        return front;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
    }
    public static void main(String[] args) {
        Queues q=new Queues(5);
        q.add(1);
        q.add(12);
        q.add(23);
        q.add(34);
        q.add(45);
       // q.add(56);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
