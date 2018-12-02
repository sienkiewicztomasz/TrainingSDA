package pl.sda;

import java.util.LinkedList;

import java.util.Queue;



public class BlockingQueue<T> {



    private Queue<T> queue = new LinkedList<T>();

    private int capacity;



    public BlockingQueue(int capacity) {

        this.capacity = capacity;

    }



    public synchronized void put(T element) throws InterruptedException {

        while(queue.size() == capacity) {

            wait();

        }



        queue.add(element);

        notifyAll(); // notifyAll() for multiple producer/consumer threads

        System.out.println("put element " + element + " size = " + queue.size());

    }



    public synchronized T take() throws InterruptedException {

        while(queue.isEmpty()) {

            wait();

        }



        T item = queue.remove();

        notifyAll(); // notifyAll() for multiple producer/consumer threads

        System.out.println("take " + item);

        return item;

    }

}