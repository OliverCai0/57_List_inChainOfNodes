/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
     public int size() {
       return size(headReference);
     }

     public int size(Node reference){
       if(reference == null)
          return 0;
       else
         return 1 + size(reference.getReferenceToNextNode());
     }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
     public String toString() {
       return "[" + toString(headReference);
     }

     private String toString(Node reference){
       if(reference == null){
         return "]";
       }
       else return reference.getCargoReference() + "," 
                   + toString(reference.getReferenceToNextNode());
     }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        Node node = new Node(val, headReference);
        headReference = node;
        return true;
     }
}