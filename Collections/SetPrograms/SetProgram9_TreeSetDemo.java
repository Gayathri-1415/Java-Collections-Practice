import java.util.*;
public class SetProgram9_TreeSetDemo 
{
    public static void main(String[] args) {
    //Main purpose of TreeSet is to sort the elements in set
    //This program covers all the useful methods of TreeSet
    TreeSet<Integer> set=new TreeSet<>();

        // Adding elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet (sorted): " + set);

        // Basic methods
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Test value
        int x = 25;

        // Navigation methods
        System.out.println("Higher than " + x + ": " + set.higher(x));
        System.out.println("Lower than " + x + ": " + set.lower(x));
        System.out.println("Ceiling of " + x + ": " + set.ceiling(x));
        System.out.println("Floor of " + x + ": " + set.floor(x));

        // Edge cases
        System.out.println("Higher than 40: " + set.higher(40)); // null
        System.out.println("Lower than 10: " + set.lower(10));   // null

        // Remove element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Contains check
        System.out.println("Contains 30? " + set.contains(30));

        // Size
        System.out.println("Size: " + set.size());

        // Traversal
        System.out.print("Elements: ");
        for(int num : set){
            System.out.print(num + " ");
        }
    }
}
