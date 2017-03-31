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
        LinkedList<Integer> mesclada = new LinkedList<Integer>();

        int i = 0;
        int j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                mesclada.add(l1.get(i));
                i++;
            } else {
                mesclada.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()){
            mesclada.add(l1.get(i));
            i++;
        }

        while (j < l2.size()){
            mesclada.add(l2.get(j));
            j++;
        }

        return mesclada;
    }

    static LinkedList<Integer> mergesort(LinkedList<Integer> l) {
        return null; // a ser completada
    }
}