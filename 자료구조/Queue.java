/**
 * Created by Keens on 2016-03-21.
 */
public class Queue {
  private int front;
  private int rear;
  private int maxSize;
  private Object[] arr;

  public Queue(int maxSize){
    this.front = 0;
    this.rear = -1;
    this.maxSize = maxSize;
    this.arr = new Object[maxSize];
  }

  public boolean isEmpty(){
    return (front == rear + 1);
  }

  public boolean isFull(){
    return (rear == maxSize - 1);
  }

  public void enQueue(Object obj){
    if(!isFull()) arr[++rear] = obj;
  }

  public Object peek(){
    if(!isEmpty()) return arr[front];
    return null;
  }

  public Object deQueue(){
    Object obj = peek();
    front++;
    return obj;
  }
}
