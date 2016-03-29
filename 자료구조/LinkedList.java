import java.util.List;

public class LinkedList {
  private Node head;
  private Node tail;
  private int size = 0;

  private class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
      this.data = data;
      this.next = null;
    }

    public String toString() {
      return String.valueOf(this.data);
    }
  }

  private void addFirst(Object data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    size++;

    if (head.next == null) {
      tail = head;
    }
  }

  private void addLast(Object data) {
    Node newNode = new Node(data);

    if (size == 0) {
      addFirst(data);
    } else {
      tail.next = newNode;
      tail = newNode;
      size++;
    }
  }

  public Node getNode(int index) {
    Node x = head;
    for (int i = 0; i < index; i++){
      //중간에 삽입하는 node들 때문에 null point error가 뜰 수 있어 다음과 같이 처리함
      if(x == null || x.next == null){
        addLast(null);
      }
      x = x.next;
    }
    return x;
  }

  public void add(int k, Object data) {
    if (k == 0) {
      addFirst(data);
    } else {
      Node temp1 = getNode(k); // 원래 k-1 이었지만, head값에는 key를 넣는 꼼수때문에 k로 변경
      Node temp2 = temp1.next;
      Node newNode = new Node(data);
      temp1.next = newNode;
      newNode.next = temp2;
      size++;
      if (newNode.next == null) {
        tail = newNode;
      }
    }
  }

  public void add(Object data){
    addLast(data);
  }

  public int size(){
    return size - 1; // 원래 size 이었지만, head값에는 key를 넣는 꼼수때문에 size-1로 변경
  }

  public String toString(){
    if(head == null){
      return "[]";
    }
    Node temp = head.next; //원래는 head였지만, head값에는 key를 넣는 꼼수를 넣어주었기 때문에 head의 next값으로 처음에 시작
    String str = "[";
    while(temp.next != null){
      str += temp.data + ",";
      temp = temp.next;
    }
    str += temp.data;
    return str+"]";
  }
}
