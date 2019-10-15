package Lab6;

public class FindFirstDistinctNumber {
    public static void main(String[] args) {
        FindFirstDistinctNumber f = new FindFirstDistinctNumber();
        int[] arr = {1, 2, 4, 9, 3, 2, 1, 4, 5};
        System.out.println(f.findFirstDistinctNumber(arr));

    }

    Integer findFirstDistinctNumber(int[] arr) {
        int len = (3 * arr.length) - 1;
        int[] bucketArray = new int[len];
        for (int i = 0; i < arr.length; i++) {
            bucketArray[arr[i]] += 1;
        }
        for (int j = 0; j < arr.length; j++) {
            if (bucketArray[arr[j]] == 1) return arr[j];
        }
        return null;
    }
}
