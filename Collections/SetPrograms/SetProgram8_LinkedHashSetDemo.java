import java.util.*;
public class SetProgram8_LinkedHashSetDemo {
    public static void main(String[] args) {
        //In the order we inserted the o/p also will be displayed in same order if we use LinkedHashSet
        //Main use of LinkedHashSet is to preserve insertion order
        Set<Integer> s=new LinkedHashSet<>();
        s.add(30);
        s.add(19);
        s.add(42);
        s.add(1);
        System.out.println(s);
    }
}
