import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    RootList calculate(double a, double b, double c) throws RemoteException;
}
