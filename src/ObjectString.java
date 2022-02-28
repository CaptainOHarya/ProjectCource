
/**
 * @author Зулин
 *
 */
public class ObjectString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        char[] cArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(cArr);
        System.out.println(s1);

        String s2 = "О боже какая женщина";
        String s3 = "О боже какая женщина";
// символ определённый
        System.out.println(s2.charAt(7));
// эквивалетны ли объекты
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s1));
        System.out.println("-----------------------");
// Метод провекрки начала и конца
        System.out.println(s2.startsWith("О"));
        System.out.println(s2.startsWith("о"));
        System.out.println(s2.endsWith("щина"));

// проверка вхождения подстроки (-1 если не входит. иначе позиция)
        System.out.println("-----------------------");
        System.out.println(s2.indexOf("щина"));
        System.out.println(s2.indexOf("ющина"));

// последнее вхождение символа
        System.out.println("-----------------------");
        System.out.println(s2.lastIndexOf("а"));
// вернуть длину строки
        System.out.println("-----------------------");
        System.out.println(s2.length());
// замена симовлов
        System.out.println("-----------------------");
        System.out.println(s3.replace('а', 'ы'));
// обреза строки
        System.out.println("-----------------------");
        System.out.println(s3.substring(5));
        System.out.println(s3.substring(5, 8));

// перевод в нижний и верхний регистр
        System.out.println("-----------------------");
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());

// получение чистой строки
        System.out.println("-----------------------");
        String userData = "        GGGG@sa.rip   	  ";
        System.out.println(userData);
        System.out.println(userData.trim());
   }

}

