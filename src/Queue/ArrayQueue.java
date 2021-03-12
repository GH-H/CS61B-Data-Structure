package Queue;

public class ArrayQueue {
    private int maxSize;//数组最大容量
    private int front;//队列头部
    private int rear;//队列尾部
    private int[] arr;//存放数据模拟队列

    //初始化
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//队列头部前一个位置
        rear = -1;//队列尾部
    }

    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    //添加值
    public void addQueue(int n){
        if(isFull()){
            System.out.println("no available space in queue ");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    //取值
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("queue empty");
        }
        front++;
        return arr[front];
    }

    //显示队列
    public void viewQueue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return;
        }
        for(int x : arr){
            System.out.println(x);
        }
    }

    //查看头部
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("empty queue");
        }
        return arr[front + 1];
    }
}
