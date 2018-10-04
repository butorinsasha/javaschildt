package tests.test20181004;

public class Generator {

    int m;

    public Generator(int m) {
        this.m = m;
    }

    public static int countBinOnes(int n, int firstLowBits) {
        int count = 0;
        String binStr = Integer.toBinaryString(n);
        if (binStr.length() >= firstLowBits) {

            /* BUG FIX IN NEXT LINE */
            for (int i = binStr.length() - 1; i >= (binStr.length() - firstLowBits); i--) {
                if (binStr.charAt(i) == '1' )
                    count++;
            }
        } else {
            for (int i = 0; i < binStr.length(); i++) {
                if (binStr.charAt(i) == '1' )
                    count++;
            }
        }
        return count;
    }

    public int getNext() {
        m = (m * m * m) / countBinOnes(m, 4);
        return m;
    }

}
