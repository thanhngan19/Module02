import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node front;
    public Node rear;

    public Solution() {
        this.front = front;
        this.rear = rear;
    }
    public void enqueue(int data) {
        Node tmp = new Node(data);
        if(this.rear==null){
            this.rear=this.front=tmp;
            return;
        }
        else {
            this.rear.link = tmp;
            this.rear = tmp;
        }
    }
    public void deQueue(){
        if(this.front==null){
            System.out.println("null");
        }
        else if(this.front== this.rear){
            this.front= this.rear=null;
        }
        else{
            this.front= this.front.link;
            Node tmp = this.front;
        }
    }

    public static void main(String[] args) {
        Queue queue = new LinkedList();

    }
}
