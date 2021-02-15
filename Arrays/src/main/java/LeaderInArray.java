public class LeaderInArray {
    public static void main(String[] args) {
        LeaderInArray leaderInArray = new LeaderInArray();
        int[] input = new int[]{7,10,4,3,6,5,2};
        leaderInArray.leader(input);
    }
    public void leader(int[] input){

        int len = input.length;
        int leader =input[len-1];
        System.out.println(leader);

        for (int i= len-1; i>0;i--){

            if (input[i-1] > leader){
                leader = input[i-1];
                System.out.println(leader);
            }
        }

    }
}
