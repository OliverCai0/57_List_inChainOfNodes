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
    }
}
