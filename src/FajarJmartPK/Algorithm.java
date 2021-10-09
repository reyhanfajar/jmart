package FajarJmartPK;

import java.util.Arrays;
import java.util.Iterator;

public class Algorithm {
    private Algorithm(){}

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

    public static <T> int count(T[] array, Predicate<T> pred) { return 0; }

    public static <T> int count(Iterable<T> iterable, Predicate<T> pred){
        return 0;
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        return 0;
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
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred){
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred){
        return false;
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
        return null;
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> pred){
        return null;
    }

    public static <T> T find(Iterator<T> iterator, Predicate<T> pred){
        return null;
    }


    public static <T> T max(T first, T second){
        return null;
    }

    public static <T> T min(T first, T second){
        return null;
    }
}
