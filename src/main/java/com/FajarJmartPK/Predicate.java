package com.FajarJmartPK;

/**
 * FajarJmartPK
 *
 * Predicate Interface
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

@FunctionalInterface
public interface Predicate<T> {
    boolean predicate(T arg);
}
