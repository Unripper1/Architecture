import java.rmi.RemoteException;

public class CalcServer implements Calculator{
    @Override
    public RootList calculate(double a, double b, double c) throws RemoteException {
        Double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            Double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return new RootList(x1,x2,true);
        }
        else if (D == 0) {
            Double x;
            x = -b / (2 * a);
            return new RootList(x,x,true);
        }
        else {
            return new RootList(null,null,false);
        }
    }
}
