/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node_iterationStyle {
    private Object cargoReference;
    private Node_iterationStyle referenceToNextNode;


    /**
      Construct an instance
     */
    public Node_iterationStyle( Object cargoReference) {
      this.cargoReference = cargoReference;
    }
    public Node_iterationStyle( Object cargoReference, Node_iterationStyle referenceToNextNode) {
        // /* For incremental development with the skeleton's UserOfNode,
           // postpone writing this constructor until after the accessors.
           // Then remove this comment, of course.
         // */
         this(cargoReference);
         setReferenceToNextNode(referenceToNextNode);
     }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        String result =
            cargoReference.toString()  // polymorphically use appropriately toString!
          + " id " // include a usually-unique identifier for this node
          + super.toString()
          ;

        // Show rest of chain of nodes
        if( referenceToNextNode == null)
             result += " [no next]";
        else result += " --> " + referenceToNextNode;
        return result;
    }

    // // classic accessor and mutator
     public Node_iterationStyle getReferenceToNextNode() {
       return referenceToNextNode;
     }

     public void setReferenceToNextNode( Node_iterationStyle referenceToNextNode) {
       this.referenceToNextNode = referenceToNextNode;
     }
    
     public Object getCargoReference() {
       return cargoReference;
    }
}