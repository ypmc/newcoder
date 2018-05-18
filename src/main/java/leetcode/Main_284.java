package leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kangkang lou
 */
class PeekingIterator implements Iterator<Integer> {
    List<Integer> list = new LinkedList<>();

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return list.get(0);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return list.remove(0);
    }

    @Override
    public boolean hasNext() {
        return list.size() > 0;
    }
}

public class Main_284 {

}
