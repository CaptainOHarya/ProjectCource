import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 */

/**
 * @author Зулин
 * Математические операции
 * Все методы класса статические
 */
public class ObjectMath {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-7));
        System.out.println(Math.sin(90 * Math.PI / 180));
        System.out.println(Math.round(Math.cos(90 * Math.PI / 180)));
        System.out.println(Math.max(1, 21));
        System.out.println(Math.min(23, 1789));
        System.out.println(Math.pow(54.772255750516614, 2));
        System.out.println(Math.sqrt(3000));
        System.out.println(Math.round(5.7));
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(5.7));

        // округлять до определенного колдичества посе запятой
        BigDecimal bg = new BigDecimal(5.98976230);
        System.out.println(bg.setScale(3, RoundingMode.HALF_UP));




    }

}

