package codechef.practice;

import java.util.*;

public class TestClass {
    public static void main(String args[]) {
        try {
            int i=5,j=2;
            System.out.printf("%d %d",i<<j,i>>j);
        }catch (NumberFormatException e){
            System.out.println("bad number");
        }
    }


}
