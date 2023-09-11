public class Reduce {
    public static void main(String[] args) {
        int i = 100; // Starting num from readme
        int count = 0;
        while (i != 0) {
            if (i %2 == 0) {
                i = i / 2;
                count++;
            }
            // Only other option is i is odd
            else{
                i = i - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
