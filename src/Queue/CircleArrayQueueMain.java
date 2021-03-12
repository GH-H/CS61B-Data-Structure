package Queue;

import java.util.Scanner;

public class CircleArrayQueueMain {
    public static void main(String[] args) {
        CircleArrayQueue q = new CircleArrayQueue(4);
        char input = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            System.out.println("s(show)");
            System.out.println("e(exit)");
            System.out.println("a(add)");
            System.out.println("g(get)");
            System.out.println("h(head)");
            input = scanner.next().charAt(0);
            switch (input){
                case 's':
                    q.viewQueue();
                    break;
                case 'a':
                    System.out.println("enter a number");
                    int num = scanner.nextInt();
                    q.addQueue(num);
                    break;
                case 'g':
                    try {
                        int res = q.getQueue();
                        System.out.println("the num you get is " + res);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int res = q.headQueue();
                        System.out.println("head is " + res);
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
