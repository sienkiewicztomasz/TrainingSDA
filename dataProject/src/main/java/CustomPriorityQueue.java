import org.apache.commons.lang3.RandomStringUtils;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class CustomPriorityQueue <T> {

    private Queue<T> elements = new PriorityQueue<>();



    public void push(T element) {

        elements.add(element);
    }



    public T pop() {

        return elements.poll();

    }


    public T pick() {

        return elements.poll();

    }



    public boolean isEmpty(){

        return elements.isEmpty();

    }



    public int size() {

        return elements.size();

    }



    public void clear() {

        while (!elements.isEmpty()) {

            T element = elements.poll();

            System.out.println(element);

        }

    }



    public static void main(String[] args) {

        CustomPriorityQueue<Integer> stack = new CustomPriorityQueue<>();

        Random random = new Random();
        for (int i=0; i<10; i++) {
            stack.push(random.nextInt(100));
        }

        stack.clear();

        CustomPriorityQueue<String> stack1 = new CustomPriorityQueue<>();

        Random random1 = new Random();

        for (int i=0; i<10; i++) {
            String generatedString = RandomStringUtils.randomAlphabetic(1);
            stack1.push(generatedString);
        }
        stack1.clear();



    }
}
