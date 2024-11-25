package Belajar.Variable.Operator;
public class LogicalOperator {
    public static void main(String[] args) {
        //and
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);
        //or
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
        //NOT
        System.out.println(!true);
        System.out.println(!false);

        System.out.println((true && true) && (false || false));
    }
}
