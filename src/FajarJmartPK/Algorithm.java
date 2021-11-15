package FajarJmartPK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Algorithm {
    private Algorithm(){}

    //collect
    public static <T> List<T> collect(T[] array, T value) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it, value);
    }

    public static <T> List<T> collect(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return collect(it, value);
    }

    public static <T> List<T> collect(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return collect(iterator, (T) pred);
    }

    public static <T> List<T> collect(T[] array, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it, pred);
    }

    public static <T> List<T> collect(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return collect(it, pred);
    }

    public static <T> List<T> collect(Iterator<T> iterator, Predicate<T> pred) {
        return collect(iterator, pred);
    }

    //count
    public static <T> int count(T[] array, T value) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return count(it, value);
    }

    public static <T> int count(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return count(it, value);
    }

    public static <T> int count(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return count(iterator, pred);
    }

    public static <T> int count(T[] array, Predicate<T> pred) {
        final Iterator<T> it = Arrays.stream(array).iterator();
        return count(it, pred);
    }

    public static <T> int count(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return count(it, pred);
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        return count(iterator, pred);
    }

    //exists
    public static <T> boolean exists(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it, value);
    }

    public static <T> boolean exists(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return exists(it, value);
    }

    public static <T> boolean exists(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return exists(iterator, pred);
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it, pred);
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return exists(it, pred);
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred){
        return exists(iterator, pred);
    }

    //find
    public static <T> T find(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return find(it, value);
    }

    public static <T> T find(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return find(it, value);
    }

    public static <T> T find(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return find(iterator, pred);
    }

    public static <T> T find(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return find(it, pred);
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return find(it, pred);
    }

    public static <T> T find(Iterator<T> iterator, Predicate<T> pred){
        return find(iterator, pred);
    }
    
    //max
    public static <T extends Comparable<? super T>> T max(T first, T  second) {
        if(first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
 
    public static <T extends Comparable<? super T>> T max(T[] array) {
        T maximum = array[0];

        for (T each : array) {
            if(each.compareTo(maximum) > 0)
            {
                maximum = each;
            }
            else {
                maximum = maximum;
            }
        }

        return maximum;
 }
 
    public static <T extends Comparable<? super T>> T max(Iterable<T> iterable) {
        final Iterator <T> each  = iterable.iterator();
        T maximum = null;
        while(each.hasNext()) {
            if (each.next().compareTo(maximum) > 0)
            {
                maximum = each.next();
            }
        }
        return maximum;
    }
 
    public static <T extends Comparable<? super T>> T max(Iterator<T> iterator) {
        T maximum = null;

        while(iterator.hasNext()) {
            if(iterator.next().compareTo(maximum) >= 0) {
            }
        }
        return maximum;
    }
 
    public static <T extends Comparable<? super T>> T max(T first, T second, Comparator<? super T> comparator) {
        T maximum;

        if(comparator.compare(first, second) >= 0){
            maximum = first;
        }
        else {
            maximum = second;
        }
        return maximum;
    }
 
    public static <T extends Comparable<? super T>> T max(T[] array, Comparator<? super T> comparator) {
        T maximum = null;
        
        for (T each : array) {
            if(comparator.compare(each, maximum) >= 0){
                maximum = each;
            }
        }
        return maximum;
    }
 
    public static <T extends Comparable<? super T>> T max(Iterable<T> iterable, Comparator<? super T> comparator) {
        final Iterator <T> each  = iterable.iterator();
        T maximum = null;

        while(each.hasNext()) {
            if (comparator.compare(each.next(), maximum) >= 0) {
            maximum = each.next();
            }
        }
        return maximum;
    }
 
    public static <T extends Comparable<? super T>> T max(Iterator<T> iterator, Comparator<? super T> comparator) {
        T maximum = null;
        while(iterator.hasNext()) {
            if(comparator.compare(iterator.next(), maximum)>= 0) {
            }
        }
        return maximum;
    }

    public static <T extends Comparable<? super T>> T min(T  first, T  second) {
        if(first.compareTo(second) < 0) {
            return first;
        }
        return second;
    }
    
    public static <T extends Comparable<? super T>> T min(T[] array) {
        T minimum = null;

        for (T each : array) {
            if(each.compareTo(minimum) < 0) {
                minimum = each;
            }
            else {
                minimum = minimum;
            }
        }

        return minimum;
    }
    
    public static <T extends Comparable<? super T>> T min(Iterable<T> iterable) {
        final Iterator <T> each  = iterable.iterator();
        T minimum = null;

        while(each.hasNext()) {
            if (each.next().compareTo(minimum) < 0) {
                minimum = each.next();
            }
        }
        return minimum;
    }
    
    public static <T extends Comparable<? super T>> T min(Iterator<T> iterator) {
        T minimum = null;

        while(iterator.hasNext()) {
            if(iterator.next().compareTo(minimum) >= 0) {
            minimum = iterator.next();
            }
        }
        return minimum;
    }
    
    public static <T extends Comparable<? super T>> T min(T first, T second, Comparator<? super T> comparator) {
        T minimum;

        if(comparator.compare(first, second) >= 0) {
            minimum = first;
        }
        else {
            minimum = second;
        }
        return minimum;
    }
    
    public static <T extends Comparable<? super T>> T min(T[] array, Comparator<? super T> comparator) {
        T minimum = null;

        for (T each : array) {
            if(comparator.compare(each, minimum) <= 0) {
                minimum = each;
            }
        }
        return minimum;
    }
    
    public static <T extends Comparable<? super T>> T min(Iterable<T> iterable, Comparator<? super T> comparator) {
        final Iterator <T> each  = iterable.iterator();
        T minimum = null;
        
        while(each.hasNext()) {
            if (comparator.compare(each.next(), minimum) <= 0){
                minimum = each.next();
            }
        }
        return minimum;
    }
    
    public static <T extends Comparable<? super T>> T min(Iterator<T> iterator, Comparator<? super T> comparator) {
        T minimum = null;

        while(iterator.hasNext()) {
            if(comparator.compare(iterator.next(), minimum)>= 0) {  
            }
        }
        return minimum;
    }
    
    //paginate
    public static <T> List<T> paginate (T[] array, int page, int pageSize, Predicate<T> pred){
        return paginate(array, page, pageSize, pred);
    }

    public static <T> List<T> paginate (Iterable<T> iterable, int page, int pageSize, Predicate<T> pred){
        return paginate(iterable, page, pageSize, pred);
    }

    public static <T> List<T> paginate (Iterator<T> iterator, int page, int pageSize, Predicate<T> pred){
        return paginate(iterator, page, pageSize, pred);
    }
}
