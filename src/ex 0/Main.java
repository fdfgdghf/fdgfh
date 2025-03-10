import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        double Number = 20;
        double Number2 = 80;
        double Number3 = (Number + Number2) * 100;
        double Number4 = Number3 % 40;
        boolean Number5 = Number4 == 0 ? true : false;
        if (Number5 == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}