package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    private static  final Turtles INSTANCE = new Turtles();
    private Turtles(){};


    public static Turtles getInstance(){
        return INSTANCE;
    }


    public int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return factorial(n-1) * n;
    }


    public int GCD(int x, int y){
        while((x > y) && (y > 0)) {
            return GCD(y, x % y);
        }
        return x;
    }

    public int GCD2(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
