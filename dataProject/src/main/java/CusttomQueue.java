import java.util.LinkedList;



    public class CusttomQueue<T> {



        private LinkedList<T> elements = new LinkedList<>();



        public void push(T element) {

            elements.addLast(element);
        }



        public T pop() {

            return elements.removeFirst();

        }


        public T pick() {

            return elements.getLast();

        }



        public boolean isEmpty(){

            return elements.isEmpty();

        }



        public int size() {

            return elements.size();

        }



        public void clear() {

            while (!elements.isEmpty()) {

                T element = elements.pop();

                System.out.println(element);

            }

        }



        public static void main(String[] args) {

            CusttomQueue<Integer> stack = new CusttomQueue<Integer>();

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.clear();



        }

    }

