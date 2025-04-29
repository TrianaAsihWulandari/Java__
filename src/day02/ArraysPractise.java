package day02;

import java.util.Arrays;

public class ArraysPractise {
    public static void main(String[] args) {
/*        initArray();
        System.out.println();
        var pow = powNumber(5);
        displayArray(pow);
        System.out.println();

        //tanpa pake variable temp
        displayArray(oddNumber(10));
        System.out.println();
        displayArray((fibonacci(10)));

        System.out.println();
        var myNums = new int[]{1,2,5,2,1};
        System.out.println(isPalindrome(myNums));*/

        // challanges
        var words = new String[]{"min","maxx","min"};
        System.out.println(isPalindromeQuiz(words));

        displayArray(addOnePlusQui(new int[]{1,2,3,4}));
        System.out.println();
        displayArray(orderEvenOdd(new int[]{1,2,3,4,5,6,7,8}));
    }

    public static void initArray(){
        //deklarasi array
        int[] myNums = new int[5];
        myNums[0]=1;
        //myNums[6]=2; // out of bonds

        displayArray(myNums);

        String[] programs = new String[]{"Java","C#"};


    }

    public static boolean isPalindrome(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
    
    public static int[] fibonacci(int n){
        var newArray = new int[n];
        newArray[0] =1;
        newArray[1]=1;
        for (int i = 2; i < n ; i++) {
            newArray[i]= newArray[i-2] + newArray[i-1];
        }
        return newArray;
    }

    public static int[] powNumber(int n){
        var newArray = new int[n];
        //int[] newArray = new int[n];

        // 12312321321.78 double
        // 12312321321 int

        for (int i = 0; i < n; i++) {
            newArray[i]= (int) Math.pow(2,i);
        }

        return newArray;
    }

    public static int[] oddNumber(int n){
        var newArray = new int[n];

        for (int i = 0; i <n; i++) {
            newArray[i]= 2 * i +1;
        }

        return newArray;
    }

    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /* Challanges
    * */

    public static boolean isPalindromeQuiz(String[] words){

        for (int i = 0; i < words.length/2; i++) {
            if (!words[i].equals(words[words.length-i-1])){
                return false;
            }
        }
        return true;
    }

    public static int[] addOnePlusQui(int[] numbers){
        if (numbers.length ==0){
            throw  new IllegalArgumentException("An array should not empty");
        }

        // Salin array origin,result akan punya length yg sama dengan array value
        int[] result = numbers.clone();

        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] < 9) {
                result[i]++;
                break;
            } else {
                result[i] = 0;
                // Lanjut ke digit sebelumnya (carry)
                if (i == 0) {
                    // buat array baru dimana length +1, jika digit 9
                    int[] newResult = new int[result.length + 1];
                    newResult[0] = 1;
                    //jika kita set return di loop, maka akan exit dari loop dan return newResult
                    return newResult;
                }
            }
        }
        return result;
    }

    public static int[] orderEvenOdd(int[] numbers){
        int nextEven =0; // bil genap
        int nextOdd = numbers.length-1; //bil ganjil

        while (nextEven < nextOdd){
            final int currentValue = numbers[nextEven];
            if (currentValue% 2 ==0){
                nextEven++;
            }else{
                final int temp = numbers[nextEven];
                numbers[nextEven]=numbers[nextOdd];
                numbers[nextOdd]=temp;
                nextOdd--;
            }
        }
        return numbers;
    }


}
