package Lab5;

public class InterviewQuestionThree {
    public static void main(String[] args) {
        InterviewQuestionThree interviewQuestionThree = new InterviewQuestionThree();
        int[] arr = {-1,0,1,2,3,4,6,7,8};
        System.out.println(interviewQuestionThree.containsM(arr));
    }
    boolean containsM(int[] arr){
        return innerMethod(arr, 0, arr.length -1);
    }
    boolean innerMethod(int[] arr, int lowerBound, int upperBound){
        if(lowerBound > upperBound){
            return false;
        }else {
            int mid = (lowerBound + upperBound) /2;
            if(arr[mid] == mid) return true;
            else if(arr[mid] > mid){
                return innerMethod(arr, lowerBound, mid-1);
            }
            else {
                return innerMethod(arr, mid+1, upperBound);
            }
        }
    }


}
