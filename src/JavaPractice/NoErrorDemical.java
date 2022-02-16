import java.math.*;

public class NoErrorDemical {
    public static void main(String[] args){
        BigDecimal e1 = new BigDecimal("1.2");
        BigDecimal e2 = new BigDecimal("5.1");
        BigDecimal e3 = e1.subtract(e2);

        System.out.println(e3.abs());

    }
}
