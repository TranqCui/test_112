package otherTest;

import org.junit.Test;

/**
 * Created by cuibinbin on 2017/11/15.
 */
public class demo2 {
    @Test
    public void test1(){
        String str = "abc";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
        }
//        System.out.println(stringBuilder);
    }
}
