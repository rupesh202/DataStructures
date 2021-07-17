public class DistanceBtwnXY {
    public static void main(String[] args) {
        int[] input = {2, 5, 3, 5, 4, 4, 2, 3};
        int x =3;
        int y =6;
        System.out.println("min distance is: " + distancebtwnTwo(x,y,input));
    }
    public static int distancebtwnTwo(int x, int y, int[] input){
        int prev =-1;
        int min =Integer.MAX_VALUE;
        for (int i =0; i<input.length; i++){

            if (input[i] ==x || input[i] == y){

                if (prev != -1 && (input[i] != input[prev])){
                    min = Math.min(min, i-prev);

                }
                prev =i;
            }
        }
        return min;

    }

}
