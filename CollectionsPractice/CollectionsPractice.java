package collectionFrameWorkPractice;

public class CollectionsPractice {
    public static void main(String[] args) {

        
        /*  --> ARRAYLIST
       // ArrayList <String> arrStr = new ArrayList<>();
        ArrayList <Integer> arrInt = new ArrayList<>();    //size dynamically increases if array gets filled 50% then arraylist will create another array and copy them all in the new arraylist

        arrInt.add(10);
        arrInt.add(20);
        arrInt.add(30);
        arrInt.add(40);
        arrInt.add(50);
        arrInt.add(60);

        Iterator <Integer> iterator = arrInt.iterator();  //iterator working
         while(iterator.hasNext()){
             System.out.print(iterator.next()+ " ");
         }
        */



        /* STACK --> LIFO
        Stack <Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
         */


        /*  Queue --> FIFO
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);  //.add() will throw exception
        queue.offer(20);  //.add will throw exception
        queue.offer(30);  //.add will throw exception
        queue.offer(40);  //.add will throw exception

        System.out.println(queue);

        queue.poll();  // .remove() will throw exception

        System.out.println(queue);
        System.out.println(queue.peek());  //.element() will throw exception
         */


        /*
        // PRIORITY QUEUE --> USED IN *****HEAP******
        PriorityQueue <Integer> pq = new PriorityQueue<>();  // priority queue implements queue interface

         pq.offer(10);
         pq.offer(90);
         pq.offer(20);
         pq.offer(35);

        System.out.println(pq);  //[10, 35, 20, 90] --> this will create a MINHeap  (every parent node is smaller than its child node)
        System.out.println(pq.peek());  // 10 is the peek element
        System.out.println(pq.poll());  // because this is min heap , top element/parent node ==10 will get popped

        System.out.println(pq);  //[20, 35, 90]

        //MAX HEAP IMPLEMENTATION

        PriorityQueue <Integer> pqmax= new PriorityQueue<>(Comparator.reverseOrder());
        pqmax.offer(10);
        pqmax.offer(20);
        pqmax.offer(30);
        pqmax.offer(40);
        pqmax.offer(50);

        System.out.println(pqmax);  //[50, 40, 20, 10, 30]
        System.out.println(pqmax.peek()); //50
        System.out.println(pqmax.poll()); //50
        System.out.println(pqmax); //[40, 30, 20, 10]
         */



        /*
        // ArrayDeque -- element can be added from the first or last , used in sliding windows problem

        ArrayDeque < Integer> adq = new ArrayDeque<>();
        adq.add(10);
        adq.add(20);
        adq.add(30);
        adq.add(40);
        adq.addFirst(5);
        adq.addLast(45);

        System.out.println(adq);  //[5, 10, 20, 30, 40, 45]

        System.out.println(adq.peekFirst());  //5
        System.out.println(adq.peekLast());  //45

        System.out.println(adq.pollFirst()); //5
        System.out.println(adq.pollLast());  //45

        System.out.println(adq); //[10, 20, 30, 40]
         */



        /*
      //LinekdHashSet  --> in linkedHashSet order is maintained , it implements both linked list and hashset properties

        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set); //[10, 20, 30, 40, 50]
         */


        
        /*
        //TreeSet  /--> gives output in sorted manner , follows set properties also.

        Set<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);

        System.out.println(set);  //[10, 20, 30, 40, 50]
         */


        /*
        // COLLECTION CLASS

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(90);
        list.add(40);
        list.add(40);

        System.out.println("min " + Collections.min(list));  //min 10
        System.out.println("max " + Collections.max(list));  //max 40

        System.out.println(Collections.frequency(list,40)); //3

        Collections.sort(list);  //Ascending order sort
        System.out.println(list); //[10, 20, 30, 40, 40, 40, 90]

        Collections.swap(list,0,list.size()-1);
        System.out.println(list);  //[90, 20, 30, 40, 40, 40, 10]


        Collections.sort(list, Comparator.reverseOrder()); //Descending order sort
        System.out.println(list);  //[90, 40, 40, 40, 30, 20, 10]
         */


    }
}
