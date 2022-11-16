public class Stack {

    //FİFO : Son giren ilk çıkar

    int topOfStack;
    int capacity;
    int[] stack;

    Stack(int capacity){
        this.capacity = capacity;
        stack = new int[capacity]; //yeni bir array olusturdum
        topOfStack = -1; //Herhangi bir push anında bir arttırarak 0 degerini yakalamak ıstıyoruz
    }

    void push(int element){
        if(topOfStack == capacity-1){
            System.out.println("overflow...");
        }else{
            topOfStack++;
            stack[topOfStack] = element;
            System.out.println("added..." + element);
        }
    }

    int pop(){
        if(topOfStack < 0){
            System.out.println("underflow...");
            return 0;
        }else {
            int element = stack[topOfStack];
            topOfStack--;
            return element;
        }

    }

    public static void main(String[] args){
      Stack stack1 = new Stack(5);
      stack1.push(25);
      stack1.push(45);
      stack1.push(96);
      stack1.push(12);
      stack1.push(98);
      stack1.push(66);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
