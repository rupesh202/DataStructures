package popular;

public class Palidrom {
    public static void main(String[] args) {
        String input = "aaabaaaaaabaaa";
        Palidrom palidrom = new Palidrom();
        System.out.println(palidrom.checkIfPalindrom(input));

    }
    public boolean checkIfPalindrom(String input){
        // [l,e,v,e,l]

        boolean result = true;
        char[] charInput = input.toCharArray();
        int i =0; int j = input.length() -1;
        while (i <j){
            if (charInput[i] != charInput[j]){
                result = false;
            }
            i++;
            j--;
        }
        return result;
    }
}
