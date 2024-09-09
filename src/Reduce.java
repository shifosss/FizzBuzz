public class Reduce {
    public static void main(String[] args) {
        final int NUM = 100;
        int x = NUM;
        int cnt = 0;
        while (x > 0) {
            x = (x % 2 == 0) ? x / 2 : x - 1;
            cnt++;
        }
        System.out.println("The number of steps it take to reduce number " + NUM + " is "+ cnt);
    }
}
