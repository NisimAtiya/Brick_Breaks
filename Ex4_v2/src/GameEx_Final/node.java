package GameEx_Final;
/**
 * This class represents a single node in a LinkedList that implements LinkedListInterface.
 * @author Asaly.Saed
 *
 */
public class node implements NodeInterface{
    private GeoShape data;
    private node next;

    public node(GeoShape data,node next){
        setData(data);
        setNext(next);
    }

    @Override
    public GeoShape getData() {
        // TODO Auto-generated method stub
        return data;
    }

    @Override
    public void setData(GeoShape g) {
        // TODO Auto-generated method stub
        this.data = g;

    }

    @Override
    public NodeInterface getNext() {
        // TODO Auto-generated method stub
        return next;
    }

    @Override
    public void setNext(NodeInterface next) {
        // TODO Auto-generated method stub
        this.next = (node) next;
    }



}
