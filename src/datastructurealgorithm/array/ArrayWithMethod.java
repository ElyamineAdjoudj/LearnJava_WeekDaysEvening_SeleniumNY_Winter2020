package datastructurealgorithm.array;

public class ArrayWithMethod {


    static void minimum(int arr[]){
        int min =arr[0];

        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }


    static int[] getArray(){
        return new int[]{34,55,70,78,90};
    }

    public static void main(String[] args) {
        int b[]={40,20,70,6,8,9,2,600,400,35};
        minimum(b);
        System.out.println("*****************");
        int arr[]=getArray();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }



    }




}
