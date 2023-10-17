public class scopes {


       static int e = 10;

    public static void main(String[] args) {

        int b = 10;
        int c = 20;
        int d = b + c;

        System.out.println(d);
        run();

    }

    public static void run() {
//        scopes vs=new scopes();

        System.out.println(e);

    }
}