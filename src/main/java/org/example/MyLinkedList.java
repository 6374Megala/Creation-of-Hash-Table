package org.example;

public class MyLinkedList <K>{
    public INode head;
    public INode tail;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public INode searchKey(K key){
        INode<K> temp=head;
        while(temp!=null && temp.getNext()!=null) {
            if(temp.getKey().equals(key)){
                return temp;
            }
            temp=temp.getNext();
        }
        return null;
    }
    public void append(INode<K> myNode){
        if(this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }
        else{
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    public Integer size(){
        if(head==null){
            return 0;
        }
        Integer length=1;
        INode temp=head;
        while(temp.getNext()!=null){
            length+=1;
            temp=temp.getNext();
        }
        return length;

    }
    public boolean isEmpty(INode head){
        if(head==null){
            return true;
        }
        return false;
    }

    /*
    public void printMyNode(){
        System.out.println("My Nodes : "+head);
    }
    public String toString(){
        return "MyLinkedListNodes{ "+head + head+' }';
    }
     */
    public void deleteByKey(K key) {
        INode<K> currentNode = head;
        INode<K> prevNode = null;

        while (currentNode != null && !currentNode.getKey().equals(key)) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode != null) {
            if (prevNode == null) {
                head = currentNode.getNext();
            } else {
                prevNode.setNext(currentNode.getNext());
            }

            if (currentNode.getNext() == null) {
                tail = prevNode;
            }
        }
    }
    public String toString(){
        return "MyLinkedListNodes{ "+head + head+'}';
    }

}
