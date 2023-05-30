public class try_catch {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;


        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException ax) {
            System.out.println(ax);
            ax.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("doan code phia sau");
        }
        finally {
            System.out.println("dong doan code nay");
        }


    }
}
