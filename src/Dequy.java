public class Dequy {
    public static void main(String[] args) {


//        dequy();

//        dequy1(1);

        //Tim giai thua cua 3
        int n = 3;
        int result = giaiThua(n);
        System.out.println(result);
    }

    /*
     * Không nên
     * */
    private static void dequy() {
        System.out.println("Hello");
        dequy();
    }

    /*
     * Nên (có ngắt: code xử lý ngắt đệ quy)
     * */
    private static void dequy1(int i) {
        if (i == 10) {
            return;
        }
        System.out.println("Hello: " + i);
        dequy1(i + 1);
    }

    //tinh giai thua
    private static int giaiThua(int n) {
        if(n==0) {
            return 1;
        }
        return n * giaiThua(n-1);
    }
}
