package main.day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers,numbers.length-1));
    }

    public static int recursionSum(int[] arr,int arrLenght){
        if(arrLenght==0){
            return 1;

        }
        return arr[arrLenght]+recursionSum(arr,arrLenght-1);

    }
}
