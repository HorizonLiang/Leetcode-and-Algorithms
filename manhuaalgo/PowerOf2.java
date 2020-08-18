public class PowerOf2 {
    public static boolean isPowerOf2(int num){
        return (num&num-1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(PowerOf2.isPowerOf2(32));
    }
}
