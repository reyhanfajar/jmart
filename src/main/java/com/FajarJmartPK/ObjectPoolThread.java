package com.FajarJmartPK;

import java.util.Vector;
import java.util.function.Function;

public class ObjectPoolThread<T> extends Thread{
    private boolean exitSignal;
    private Vector<T> objectPool;
    private Function<T, Boolean> routine;

    public ObjectPoolThread (String name, Function<T, Boolean> routine){
        super(name);
        this.routine = routine;
        ObjectPoolThread thread = new ObjectPoolThread(name, routine);
        thread.start();
    }

    public ObjectPoolThread(Function<T,Boolean> routine) {
        this.routine = routine;
    }

    public synchronized void add(T object){
        objectPool.add(object);
    }

    public synchronized void exit(){
        this.exitSignal = true;
    }

    @Override
    public void run(){
        for(int i = 0; i < objectPool.size(); i++){
            objectPool.elementAt(i);
        }
    }

    public int size(){
        return objectPool.size();
    }
}
