package problemsandsolutions;

public class RemoveDuplicateElementInArray {


    public static void main(String[] args) {
        int[] number = {1, 3, 5, 6, 3, 8, 9, 5};
//
//        for (int i = 0; i < number.length; i++) {
//            for (int j = i + 1; j < number.length; j++) {
//                if ((number[i]) == number[j]) {
//                    number[j] = 0;
//                }
//            }
//            System.out.print(number[i] + " ,");
//        }

        int length=number.length;
        length=removeDuplicateElement(number,length);

        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }

    }

    public static int removeDuplicateElement(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0; // for next element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }


}
