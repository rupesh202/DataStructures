package windowSlidingTechnique;

public class PrintNbonacciNumbers {
    public static void main(String[] args) {
        PrintNbonacciNumbers printNbonacciNumbers = new PrintNbonacciNumbers();
        int n =3; int len = 8;
        int[] result = printNbonacciNumbers.printNbonnaciImp(n,len);
        for (int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }

    public int[] printNbonnaciImp(int n, int len){

        int[] result = new int[len];
        result[n-1] = 1;
        int currSum =0;
        result[n] = 1;
        int start =0;
        //   0 0 1 1 0 0 0 0
        for (int i=0; i<n;i++){
            currSum += result[i];
        }
        for (int i=n+1;i<len;i++){

            currSum = currSum + result[i-1] - result[start];
            result[i] = currSum;
            start++;
        }
        return result;
    }
}
