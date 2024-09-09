public class Multiples {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 0; i < 1000; i++) {
            cnt = (i % 3 == 0 || i % 5 == 0) ? cnt + 1 : cnt;
        }
        System.out.println("The number of multiples of 3 or 5 between 0 and 1000 is: " + cnt);
    }
}
