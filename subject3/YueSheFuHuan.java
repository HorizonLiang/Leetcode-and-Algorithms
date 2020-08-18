public class YueSheFuHuan {
    public static void main(String[] args) {
        YueSheFuHuan yueSheFuHuan = new YueSheFuHuan();
        System.out.println(yueSheFuHuan.solve(6,4));
    }

    public int solve(int n,int m){
        if(n == 1){
            return n;
        }

        return (solve(n-1,m) + m -1) % n +1;
    }
}
