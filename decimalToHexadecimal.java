public class decimalToHexadecimal {
    public static void main(String[] args) {
        int n = 2003;
        String ans = "";
        while (n > 0) {
            int rem = n % 16;
            if (rem < 10) {
                ans = rem + ans;
            } else {
                ans = (char) (rem + 55) + ans;
            }
            n /= 16;
        }
        System.out.println(ans);
    }

}
