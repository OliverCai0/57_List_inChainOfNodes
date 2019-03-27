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

     public Object getHeadReference(){
       return headReference.getCargoReference();
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

     /**
      * Change value at given index to given value
      */

      public Object set(int index, Object newValue){
        return set(index, newValue, headReference);
      }

      private Object set(int index, Object newValue, Node reference){
        if(index == 0){
          Object oldValue = reference.getCargoReference();
          reference.changeCargoReference(newValue);
          return oldValue;
        }
        else{
          return set(index - 1, newValue, reference.getReferenceToNextNode());
        }
      }

      /**
       * Returns value at given index
       */

       public Object get(int index){
         return get(index, headReference);
       }

       private Object get(int index, Node reference){
          if (index == 0) return reference.getCargoReference();
          else{
            return get(index - 1, reference.getReferenceToNextNode());
          }
       }

       /**
        * Inserts a given value at a given index
        */

        public void add(int index, Object value){
          if(index == 0){
            addAsHead(value);
          }
          Node valueHolder = new Node(value);
          add(index, value, headReference, valueHolder);
        }

        private void add(int index, Object value, Node reference, Node valueHolder){
          if(index == 0){
             valueHolder.setReferenceToNextNode(reference);
          }
          else {
            add(index - 1, value, reference.getReferenceToNextNode(), valueHolder);
            if(index == 1){
              reference.setReferenceToNextNode(valueHolder);
            }
        }
      }
	
	/**
  Removes a value at a given index
  */
  
  public Object remove(int index){
    Object removedObject;
    Node targetNode = headReference;
    int element = index;
    if(index == 0){
      removedObject = headReference.getCargoReference();
      headReference = headReference.getReferenceToNextNode();
    }
    else if (index == (size() - 1)){
      while(element > 1){
        targetNode = targetNode.getReferenceToNextNode();
        element --;
      }
      removedObject = targetNode.getReferenceToNextNode().getCargoReference();
      targetNode.setReferenceToNextNode(null);
    }
    else {
      while(element > 1){
        targetNode = targetNode.getReferenceToNextNode();
        element --;
      }
      removedObject = targetNode.getReferenceToNextNode().getCargoReference();
      targetNode.setReferenceToNextNode(targetNode.getReferenceToNextNode().getReferenceToNextNode());
    }
    return removedObject;
  }
/** 
	public Object remove(int index){
    Object removedObject;
    Node priorNode = headReference;
    if(index == 0){
      removedObject = headReference.getCargoReference();
      addAsHead(headReference.getReferenceToNextNode());
    }
    while(index > 1){
      priorNode = priorNode.getReferenceToNextNode();
      index --;
    }
    Node targetNode = priorNode.getReferenceToNextNode();
    removedObject = targetNode.getCargoReference();
    if(targetNode.getReferenceToNextNode() != null){
      priorNode.setReferenceToNextNode(targetNode.getReferenceToNextNode());
    }
    else{
      priorNode.setReferenceToNextNode(null);
    } 
		return removedObject;
  }
  */
}
