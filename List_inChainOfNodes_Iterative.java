/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_Iterative{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */

     public int size(){
         int size = 0;
         Node reference = headReference;
         while(reference != null){
             size ++;
             reference = reference.getReferenceToNextNode();
         }
         return size;
        }
    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */

     public String toString(){
         String listString = "";
         Node reference = headReference;
         while(reference != null){
             listString = listString + reference.getCargoReference();
             reference = reference.getReferenceToNextNode();
         }
         return listString;
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