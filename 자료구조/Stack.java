/**
 * Created by Keens on 2016-03-21.
 */
public class Stack {
  private int top;
  private int maxSize;
  private Object[] arr;

  public Stack(int maxSize){
    this.maxSize = maxSize;
    this.arr = new Object[maxSize];
    this.top = -1;
  }

  public boolean isEmpty(){
    return (top == -1);
  }

  public boolean isFull(){
    return (top == maxSize - 1);
  }

  public void push(Object obj){
    if(!isFull()) arr[++top] = obj;
  }

  public Object peek(){
    if(!isEmpty()) return arr[top];
    else return null;
  }

  public Object pop(){
    Object item = peek();
    top -= 1;

    return item;
  }
}
