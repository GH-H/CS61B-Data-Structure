package Queue;

public class CircleArrayQueue {
    private int maxSize;//数组最大容量
    private int front;//队列头部
    private int rear;//队列尾部
    private int[] arr;//存放数据模拟队列

    //初始化
    public CircleArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull(){
        return (rear + 1)%maxSize == front;
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
        arr[rear] = n;
        //remainder,超出范围往前跳
        rear = (rear + 1) % maxSize;
    }

    //取值
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("queue empty");
        }
        int temp = arr[front];
        front = (front + 1)%maxSize;
        return temp;
    }

    //显示队列
    public void viewQueue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return;
        }
        for(int i = front;i<front+size();i++){
            System.out.println("arr["+i%maxSize+"]= "+arr[i%maxSize]  );
        }
    }

    public int size(){
        return (rear - front +maxSize)%maxSize;
    }

    //查看头部
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("empty queue");
        }
        return arr[front];
    }
}
