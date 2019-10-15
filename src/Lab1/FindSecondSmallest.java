package Lab1;

public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] aa = {1};
        System.out.println(secondSmallest(aa));
    }
    public static int secondSmallest(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        //implement

        int smallest = 0;
        int secondSmallest = 0;

        if(arr[0] < arr[1]){
            smallest = arr[0];
            secondSmallest = arr[1];
        }
        else {
            smallest = arr[1];
            secondSmallest = arr[0];
        }
        if(arr.length == 2) return secondSmallest;
        else {
            for(int i = 2; i < arr.length; i ++){
                if(arr[i] <= smallest){
                    secondSmallest = smallest;
                    smallest = arr[i];
                }
                else if (arr[i] <= secondSmallest){
                    secondSmallest = arr[i];
                }
            }
        }
        return secondSmallest;
    }
}
