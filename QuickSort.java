public class QuickSort {
    public static void main(String[] args) {
//      int[] numbers = new int[]{20, 31, 88, 90, 4, 2, 6};
//      int biggest = numbers[0];
//      for(int i = 0; i < numbers.length; i++){
//          if (numbers[i] > biggest){
//              biggest = numbers[i];
//          }
//      }
//        System.out.println("the biggest: " + biggest);

        //
        int[]arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21);
        }
        int temp;
        for (int i = 0; i < arr.length; i++) System.out.printf("%3d",arr[i]);
        System.out.println(); //alt satıra geçsin diye
        for (int i = 0; i < arr.length -1; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.printf("%3d",arr[i]); //diziyi tekrar yazdırsın dıye ekledım

    }
    }
