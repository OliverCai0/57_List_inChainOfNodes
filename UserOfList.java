/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

	for(int count = 0; count < list.size(); count ++){
		System.out.println(list.get(count));
		}
    
    /**
     * Middle Tests
     */
	System.out.println("Changing y to " + list.set(1, "B"));
	System.out.println(list);

	list.add(2, "E");
	list.add(2, "E");

    System.out.println(list + " expecting [S,B,E,E,u,y,]");
    System.out.println(list.getHeadReference());
    
    System.out.println("Removing the letters " + list.remove(0) 
                        + " and " + list.remove(3) 
                        + " and " + list.remove(3));

    System.out.println(list + " expecting [B,E,E,]");

    System.out.println("Replacing " + list.set(0, true) + " with true");
    System.out.println("Replacing " + list.set(1, "Hello") + " with Hello");
    System.out.println("Replacing " + list.set(2, 6) + " with 6");

    System.out.println(list);

    /**
     * Edge Cases
     */

    List_inChainOfNodes edgy = new List_inChainOfNodes();

    /**
     * Population of edgy with several types
     */

     edgy.addAsHead("A");
     edgy.addAsHead(true);
     edgy.addAsHead(7);
     edgy.addAsHead(7.77);
     Boy boy = new Boy();
     edgy.addAsHead(boy);

     System.out.println();
     System.out.println();
     System.out.println("Edge Cases?");
     System.out.println(edgy); 
     System.out.println("expecting [Hello, my name is Boy and I am 17 years old,"
                             + "7.77,7,true,A,]");
     System.out.println(edgy.size());

    /**
     * Adding several types to the end of edgy
     */

    edgy.add(edgy.size() - 1, "A");
    edgy.add(edgy.size() - 1, "7");
    edgy.add(edgy.size() - 1, "7.77");
    edgy.add(edgy.size() - 1, boy);
    System.out.println(edgy + "[Hello, my name is Boy and I am 17 years old," 
                                + "7.77,7,true,A,7,7.77,"  
                                + "Hello, my name is Boy and I am 17 years old,A,]" 
                                + " -- expecting -- "
                                + "[Hello, my name is Boy and I am 17 years old," 
                                + "7.77,7,true,A,7,7.77,"  
                                + "Hello, my name is Boy and I am 17 years old,A,]"); 
    
    /**
     * Removing several types from the front and back of edgy
     */

    System.out.println("Removing boy --- " + edgy.remove(0));
    System.out.println("Removing 7.77 --- " + edgy.remove(0));
    System.out.println("Removing A --- " + edgy.remove(edgy.size() - 1));
    System.out.println("Removing boy --- " + edgy.remove(edgy.size() - 1));

    System.out.println(edgy);


    }
}
