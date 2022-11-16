public class Queque {
    //FİFO = ilk giren ilk çıkar

    int[] array;
    int capacity, first, last, currentSize; //quenin dolu olup olmadıgını değerlendirmek icin currentSize

    public Queque(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        first = 0;
        last = -1;
        this.currentSize = 0;
    }

    boolean isEmpty(){
        return currentSize == 0;
    }


    boolean isFull(){
        return currentSize == capacity;
    }

    void enqueue(int item){
        if (isFull()){
            System.out.println("overflow...");
        }else {
            System.out.println("added..." + item);
            last += 1;
            array[last] = item;
            currentSize++;
            System.out.println(last + " " + item);
        }
    }

    void dequeue(){ //ekledıklerımızı cıkartıyoruz
       if(isEmpty()){
           System.out.println("underflow...");
       }else{
           System.out.println("being taken out " + array[first]);
           first = first + 1;
           currentSize --;
       }
    }

    public static void main(String[] args){
        Queque queque = new Queque(5);
        queque.enqueue(25);
        queque.enqueue(35);
        queque.enqueue(45);
        queque.enqueue(55);
        queque.enqueue(65);
        queque.enqueue(75);

        queque.dequeue();
        queque.dequeue();
        queque.dequeue();
        queque.dequeue();
        queque.dequeue();
        queque.dequeue();
    }
}
