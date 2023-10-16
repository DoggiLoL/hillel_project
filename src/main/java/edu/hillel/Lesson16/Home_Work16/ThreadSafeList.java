package edu.hillel.Lesson16.Home_Work16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeList<T> {
    private List<T> list = new ArrayList<>();
    private ReentrantLock lock = new ReentrantLock();

    public void add(T element){
        lock.lock();
        try{
            list.add(element);
        } finally {
            lock.unlock();
        }
    }

    public void remove(T element) {
        lock.lock();
        try {
            list.remove(element);
        } finally {
            lock.unlock();
        }
    }
        public List<T> get() {
            lock.lock();
            try{
                return new ArrayList<>(list);
            } finally {
                lock.unlock();
            }
        }

    }

