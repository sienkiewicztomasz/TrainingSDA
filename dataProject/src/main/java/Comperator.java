import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.Queue;



public class Comperator<T> {

    private Queue<T> elements = new PriorityQueue<T>();







    public void push(T element) {

        elements.add(element);

    }



    public T pop() {

        return elements.poll();

    }



    public T peek() {

        return elements.peek();

    }



    public boolean isEmpty(){

        return elements.isEmpty();

    }



    public int size() {

        return elements.size();

    }



    public void clear() {

        while (!elements.isEmpty()) {

            T element = pop();

            System.out.println(element);

        }

    }



    public static void main(String[] args) {

//        CustomPriorityQueue<Integer> queue1 =

//                new CustomPriorityQueue<>(getNumberComparator());

//        queue1.push(1);

//        queue1.push(2);

//        queue1.push(3);

//        queue1.clear();

//

//        CustomPriorityQueue<String> queue2 = new CustomPriorityQueue<>();

//        queue2.push("ala ma kota");

//        queue2.push("wiewiórka");

//        queue2.push("programowanie");

//        queue2.clear();





        String s1 = "zzzaz";

        String s2 = "zzzaz";



        System.out.println(s1.compareTo(s2));



    }



    private static Comparator<Integer> getNumberComparator() {

        return new Comparator<Integer>() {

            @Override

            public int compare(Integer o1, Integer o2) {



                if (o1 % 2 == o2 % 2) {

                    return o1 < o2 ? -1 : 1;

                }



                if(o1 % 2 == 0){

                    return -1;

                }



                if(o2 % 2 == 0){

                    return 1;

                }





                return 0;

            }

        };

    }

}