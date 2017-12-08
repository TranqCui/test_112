package cn.getRoom;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuibinbin on 2017/11/15.
 */
public class demo2 {
    public static void main(String[] args){
//        String str = "abc";
////        StringBuilder stringBuilder = new StringBuilder();
////        for (int i = 0; i < str.length(); i++) {
////            stringBuilder.append(str.charAt(i));
////        }
////        System.out.println(stringBuilder);
//        List list = new ArrayList();
//        for (int i = 0; i <str.length() ; i++) {
//            list.add(str.substring(i,i+1));
//        }
//        System.out.println("original:"+list);

        char[] chs = {'a','b','c'};
        per(chs, 0, chs.length);

    }

    public static void per(char[] chs, int start, int end){
        if (start == end-1){
//            for (int i = 0; i < chs.length; i++) {
                System.out.println(chs);
//            }
        }

        for (int i = start; i < end; i++) {
            char temp = chs[i];
            chs[i] = chs[start];
            chs[start] = temp;
            per(chs, start+1, end);

            char temp1 = chs[i];
            chs[i] = chs[start];
            chs[start] = temp1;

            }
    }
}
