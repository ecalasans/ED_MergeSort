/**
 * Created by ericcalasans on 24/03/17.
 */
import java.util.LinkedList;

// A classe Mergesort a ser completada
class Mergesort {

    static void split(LinkedList<Integer> l, LinkedList<Integer> l1, LinkedList<Integer> l2) {
        for(int i = 0; i < Math.ceil(l.size()/2); i++){
            l1.add(l.get(i));
        }

        for (int j = (int) Math.floor(l.size()/2); j<l.size(); j++){
            l2.add(l.get(j));
        }
    }

    static LinkedList<Integer> merge(LinkedList<Integer> l1,
                                     LinkedList<Integer> l2) {
        return null; // a ser completada
    }

    static LinkedList<Integer> mergesort(LinkedList<Integer> l) {
        return null; // a ser completada
    }
}