/*Hannah Posch
* HW 6, Summer 2018
* The code will use a main method to build an Avl Tree and then insert a variety of elements to check to see if the 
* added rotate methods work correctly. The Avl Tree will be printed to the user.
* The textbook, Data Structures and Algorithm Analysis in Java, was consulted for this project.
*/
public class HW6 {
	
	/*
	 * main : This method will build an Avl tree to test the new functions. The
	 * results will be printed to the user to ensure the functions work correctly.
	 * @precondition: The method must instantiate an Avl tree to continue.
	 */
	public static void main( String [ ] args ) throws Exception{
		
		//First tree test
		AvlTree<Integer> tree1 = new AvlTree<>();
	    tree1.insert(5);
	    tree1.insert(4);
	    tree1.printTreeLevelOrder();
	    tree1.insert(3);
	    tree1.printTreeLevelOrder();
	    tree1.insert(6);
	    tree1.printTreeLevelOrder();
	    tree1.insert(7);
	    
	    tree1.insert(8);
	    tree1.printTreeLevelOrder();
	    tree1.insert(9);
	    tree1.printTreeLevelOrder();
	    tree1.insert(10);
	    
	    tree1.insert(15);
	    tree1.printTreeLevelOrder();
	    tree1.insert(25);
	    tree1.printTreeLevelOrder();
	    tree1.insert(12);
	    

	    tree1.insert(11);
	    tree1.printTreeLevelOrder();
	    tree1.insert(13);
	    tree1.printTreeLevelOrder();
	    tree1.insert(20);
	    
	    tree1.printTreeLevelOrder();
	    
	    //Second tree test
	    AvlTree<Integer> tree2 = new AvlTree<>();
	    
	    tree2.insert(2);
	    tree2.printTreeLevelOrder();
	    tree2.insert(1);
	    tree2.printTreeLevelOrder();
	    tree2.insert(4);
	    tree2.printTreeLevelOrder();
	    tree2.insert(5);
	    tree2.printTreeLevelOrder();
	    tree2.insert(9);
	    tree2.printTreeLevelOrder();
	    tree2.insert(3);
	    tree2.printTreeLevelOrder();
	    tree2.insert(6);
	    tree2.printTreeLevelOrder();
	    tree2.insert(7);
	    tree2.printTreeLevelOrder();
	    
	    //Third tree test
	    AvlTree<Integer> tree3 = new AvlTree<>();
	    
	    tree3.insert(3);
	    tree3.printTreeLevelOrder();
	    tree3.insert(2);
	    tree3.printTreeLevelOrder();
	    tree3.insert(1);
	    tree3.printTreeLevelOrder();
	    tree3.insert(4);
	    tree3.printTreeLevelOrder();
	    tree3.insert(5);
	    tree3.printTreeLevelOrder();
	    tree3.insert(6);
	    tree3.printTreeLevelOrder();
	    tree3.insert(7);
	    tree3.printTreeLevelOrder();
	    tree3.insert(16);
	    tree3.printTreeLevelOrder();
	    tree3.insert(15);
	    tree3.printTreeLevelOrder();
	    tree3.insert(14);
	    tree3.printTreeLevelOrder();
	    tree3.insert(13);
	    tree3.printTreeLevelOrder();
	    tree3.insert(12);
	    tree3.printTreeLevelOrder();
	    tree3.insert(11);
	    tree3.printTreeLevelOrder();
	    tree3.insert(10);
	    tree3.printTreeLevelOrder();
	    tree3.insert(8);
	    tree3.printTreeLevelOrder();
	    tree3.insert(9);
	    tree3.printTreeLevelOrder();
	    
	    
	    
	
	
    }
}
