package e;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Numbers {
    public static void main(String[] args) {
        BigInteger intBig = new BigInteger("12");
        intBig = intBig.add(new BigInteger("6"));
        System.out.println(intBig);

        //decBig has many methods to calculate something
        BigDecimal decBig = new BigDecimal("12.14241312312421");
        decBig = decBig.setScale(2, RoundingMode.DOWN);
        System.out.println(decBig);

    }
}
