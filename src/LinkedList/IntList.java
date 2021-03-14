package LinkedList;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int first,IntList rest){
        this.first = first;
        this.rest = rest;
    }


    // return size of the list using recursion
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    //return size of the list no recursion
    public int iterativeSize(){
        IntList p = this;
        int count = 0;

        while(p!= null){
            count ++;
            p = p.rest;
        }
        return count;
    }

    // return ith item
    public int get(int i){
        if(i == 0){
            return this.first;
        }
        return this.rest.get(i-1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15,null);
        L = new IntList(10,null);
        L = new IntList(5,null);
    }
}
