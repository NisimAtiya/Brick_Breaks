package GameEx_Final;

/**
 * This is a simple LinkedList class that implements LinkedListInterface.
 * Ex4: you should implement this class!
 * @author Asaly.Saed
 *
 */
public class LinkedList implements LinkedListInterface{
    private  node head = null;
    private int size = 0;
    @Override
    public NodeInterface getHead() {
        // TODO Auto-generated method stub
        return head;
    }

    @Override
    public void add(NodeInterface p) {
        // TODO Auto-generated method stub
        if(this.head == null){
            this.head = (node) p;
        }else{
            node g = this.head;
            while (g.getNext() != null ){
                g = (node)g.getNext();
            }
            g.setNext(p);
        }
        size++;
    }

    @Override
    public void remove(NodeInterface p) {
        // TODO Auto-generated method stub
        if(p == head){
            head = (node) head.getNext();
            p.setNext(null);
        }
        for (node i = head; i != null ; i= (node) i.getNext()) {
            if(i.getNext()==p){
                i.setNext(p.getNext());
                p.setNext(null);
            }
        }
        size--;

    }




}
