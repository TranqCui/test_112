package otherTest;

import org.junit.Test;

/**
 * Created by cuibinbin on 2017/11/13.
 */
public class demo {
    @Test
    public void demo1(){
        String string = "  sajfl dsajlj    l lsaj  ";
        StringBuilder stringBuilder = new StringBuilder();
        String string1 = string.trim();
        int length = string1.length();
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            char c = string1.charAt(i);
            if (c == ' '){
                if (!flag){
                    stringBuilder.append(c);
                    flag = true;
                }
            }else {
                stringBuilder.append(c);
                flag = false;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
