package macquarie.interview;

import java.util.function.Function;

public class MyMath {
    public static Integer triple(Integer x) {
        return x * 3;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> fun = MyMath::triple;
        System.out.println(fun.apply(33));
    }
}
