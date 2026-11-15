// 3 ms | 42.6 MB

class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);

        boolean negative = s.charAt(0) == '-';

        if (negative) {
            s = s.substring(1);
        }

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        long result = Long.parseLong(sb.toString());

        if (negative) {
            result = -result;
        }

        if (result < Integer.MIN_VALUE ||
            result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
