public class Sqrtx {
    public static void main(String[] args) {
        int x = 35;
        System.out.println(sqrt(x));
    }

    public static int sqrt(int x) {
        int start = 1;
        int end = x;
        if(x < 2) {
            return x;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid == x / mid ) {
                return mid;
            } else if(mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}