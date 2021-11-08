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
    public static <T> T max(T first, T second){
        return null;
    }

    public static <T> T max(T[] array){
        return null;
    }

    public static <T> T max(Iterable<T> iterable){
        return null;
    }

    public static <T> T max(Iterator<T> iterator){
        return null;
    }

    public static <T> T max(T first, T second, Comparator<?super T> comparator) { return null; }

    public static <T> T max(T[] array, Iterable<T> iterable){
        return null;
    }

    public static <T> T max(Iterable<T> iterable, Comparator<?super T> comparator){
        return null;
    }

    public static <T> T max(Iterator<T> iterator, Comparator<?super T> comparator){
        return null;
    }

    public static <T> T min(T first, T second){
        return null;
    }

    public static <T> T min(T[] array){
        return null;
    }

    public static <T> T min(Iterable<T> iterable){
        return null;
    }

    public static <T> T min(Iterator<T> iterator){
        return null;
    }

    //min
    public static <T> T min(T first, T second, Comparator<?super T> comparator) { return null; }

    public static <T> T min(T[] array, Iterable<T> iterable){
        return null;
    }

    public static <T> T min(Iterable<T> iterable, Comparator<?super T> comparator){
        return null;
    }

    public static <T> T min(Iterator<T> iterator, Comparator<?super T> comparator){
        return null;
    }
}
