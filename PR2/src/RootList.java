import java.io.Serializable;

public class RootList implements Serializable {
    Double x1;
    Double x2;
    boolean isHas;

    public RootList(Double x1, Double x2, boolean isHas) {
        this.x1 = x1;
        this.x2 = x2;
        this.isHas = isHas;
    }

    @Override
    public String toString() {
        if(isHas) {
            if (x1 != x2){
                return "x1= "+x1+" x2= "+x2;
            }
            else{
                return "x= "+x1;
            }
        }
        return "Уравнение не имеет действительных корней!";
    }
}
