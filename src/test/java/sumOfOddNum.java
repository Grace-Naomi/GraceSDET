public class sumOfOddNum {
    public static void main(String[] args) {
        int i, n = 10, sum = 0;
        for (i = 1; i <= n; i = i + 2) {

            System.out.println(i);

            sum = sum + i;
        }
        System.out.println("sum of first 10 odd numbers is " + sum);
    }

}
