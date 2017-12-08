import org.apache.log4j.helpers.DateTimeDateFormat;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

////package test;
////
////import org.junit.Test;
////
////import java.util.ArrayList;
////import java.util.Arrays;
////import java.util.List;
////
////import static java.lang.System.out;
////
/////**
//// * Created by cuibinbin on 2017/12/2.
//// */
////public class testType {
//////public static void main(String[] args){
//////    int i =1;
//////    out.println(getType(i));
//////}
//////
////    public static String getType(Object o){
////        return o.getClass().toString();
////    }
////
////    @Test
////    public void test2(){
////        List<String> list = new ArrayList();
////        list.add("a");
////        list.add("b");
////        list.add("C");
//////        String[] array = new String[list.size()];
//////        String[] s = list.toArray(array);
//////        System.out.println(Arrays.toString(list.toArray(array)));
////        String[] s = (String[])list.toArray(new String[list.size()]);
////        System.out.println(Arrays.toString(s));
////    }
////
////    @Test
////    public void test3(){
////        char[] ch = {'a','b','c'};
////        demo(ch);
////        System.out.println(ch);
////    }
////    public static void demo(char[] c){
////        c[0] = 'q';
////    }
//////    int a = 3;
//////    public static void main(String[] args){
//////        System.out.println(a);
//////    }
////}
//public class ExA {
//    public static void test(){
//        System.out.println("父类--静态方法"); //被子类的相同方法覆盖
//    }
//    static {
//        System.out.println("父类--静态代码块");
//    }
//
//    public ExA() {
//        System.out.println("父类--构造函数");
//    }
//
//    {
//        System.out.println("父类--非静态代码块");
//    }
//
//    public static void main(String[] args) {
////        ExB.test();
//        new ExB();
////        System.out.println();
////        ExB.test();
//        System.out.println();
//        new ExB();
////        ExB.test();
//
//
//    }
//}
//
//class ExB extends ExA {
//    public static void test(){
//        System.out.println("子类--静态方法");
//    }
//    static {
//        System.out.println("子类--静态代码块");
//    }
//
//    {
//        System.out.println("子类--非静态代码块");
//    }
//
//    public ExB() {
//        System.out.println("子类--构造函数");
//    }
//}
public class ExA{
//   public static void main(String[] args){
       //筛选法 选100内素数
//       int[] arr = new int[101];
//
//       for (int i = 1; i < 101; i++) {
//           arr[i] = 1;
//       }
//       for (int i = 2; i < 101; i++) {
//           if (arr[i] == 1){
//               for (int j = i+1; j < 101;j++ ) {
//                   if (j%i == 0) {
//                       arr[j] = 0;
//                   }
//               }
//           }
//       }
////       System.out.println(Arrays.toString(arr));
//       for (int i = 2; i < 101; i++) {
//           if (arr[i] == 1)
//               System.out.println(i);
//       }
//   } 
    
//    public static void main(String[] args){
//        int n=100;
//        boolean flag ;
//        for (int i = 1; i < 101; i++) {
//            flag = false;
//            for (int j = 2; j < n/2; j++) {
//                if (i%j == 0 && i!=j){
//                    flag = true;
//                }
//            }
//            if (flag == false)
//                System.out.println(i);
//        }
//    }

//    public static void main(String[] args){
//        int i,j,k;
//        for (i = 2; i < 101; i++) {
//            k=(int)Math.sqrt(i);
//            for (j = 2; j <= k; j++) {
//                if (i%j==0)
//                    break;
//            }
//            if (j>k)
//                System.out.println(i);
//        }
//    }
    public static void main(String[] args){
        String[] array  = {"1","2","3","4"};
        listAll(Arrays.asList(array), "");
//        List candidate = new LinkedList(Arrays.asList(array));
//        System.out.println(candidate.remove(0));
//        System.out.println(candidate);

    }
    public static void listAll(List candidate, String prefix){
        if (candidate.isEmpty()){
            System.out.println(prefix);
        }
        for (int i = 0; i < candidate.size(); i++) {
            List temp = new LinkedList(candidate);
            listAll(temp, prefix+temp.remove(i));
        }
    }
    
    @Test
    public void test11(){

//        Integer a = 100;
//        Integer b = 100;
//        Integer c = 1000;
//        Integer d = 1000;
//        System.out.println(a == b);
//        System.out.println(c == d);

        int s = 100;
        Integer a = 100;
//        Integer b = 100;
//        Integer c = 1000;
//        Integer d = 1000;
        Integer a1 = new Integer(100);
//        Integer c1 = new Integer(1000);
//        System.out.println(a == b);
//        System.out.println(c == d);
        System.out.println(s == a1);
        System.out.println(s == a);
        
        
//        String a = "a";
//        String b = "a";
//        String a1 = new String("a");
//        System.out.println(a == b);
//        System.out.println(a == a1);
//        System.out.println(a.equals(a1));
        
    }
    
    @Test
    public void test2(){
//        long starttime1 = System.currentTimeMillis();
//        String[] array = new String[10000000];
//        for (int i = 0; i < 10000000; i++) {
//            array[i] = i+"";
//        }
//        long endtime1 = System.currentTimeMillis();
//        System.out.println(endtime1 - starttime1);
////        System.out.println(System.currentTimeMillis());
//        long starttime2 = System.currentTimeMillis();
//        if (Arrays.asList(array).contains("9999999") == true){
//            long endtime2 = System.currentTimeMillis();
//            System.out.println(endtime2 - starttime2);
//        }
//
//        long starttime3 = System.currentTimeMillis();
//        for (String a: array
//             ) {
//            if (a.equals("9999999")){
//                long endtime3 = System.currentTimeMillis();
//                System.out.println(endtime3 - starttime3);
//            }
//        }
//
//        long starttime4 = System.currentTimeMillis();
//        for (int i =0; i<10000000;i++
//                ) {
//            if (array[i].equals("9999999")){
//                long endtime4 = System.currentTimeMillis();
//                System.out.println(endtime4 - starttime4);
//            }
//        }
        
//        long now = System.currentTimeMillis();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(now));

//        Date date  = new Date();
//        System.out.println(sdf.format(date));


//        DateTime dateTime1 = new DateTime(2018,11,30,11,2,1);
//        System.out.println(dateTime1.toString("EE yyyy-MM-dd"));
//        LocalDate localDate1 = new LocalDate(2013,2,23);
//        LocalDate localDate2 = new LocalDate(2014, 11, 2);
//        System.out.println(Days.daysBetween(localDate1,localDate2).getDays());
//        DateTime dateTime = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2013-1-1");
//        System.out.println(dateTime.toString("yyyy-MM-dd"));
//        LocalDate start=new LocalDate(2012, 12,14);
//        LocalDate end=new LocalDate(2013, 9, 15);
//        int days = Days.daysBetween(start, end).getDays();
//        System.out.println(days);
//        DateTime dateTime = DateTime.parse()
//        int hours = Hours.hoursBetween(start, end).getHours();
//        System.out.println(hours);
        
//        DateTime dateTime = new DateTime();
//        DateTime.Property month = dateTime.monthOfYear();
//        System.out.println(month.isLeap());
        
//        DateTime dateTime = DateTime.parse("2016-9-9",DateTimeFormat.forPattern("yyyy-MM-dd"));
//        DateTime dateTime1 = new DateTime();
//        System.out.println(dateTime.getYear());
//        DateTime.Property month = dateTime1.monthOfYear();
//        System.out.println(dateTime.year().isLeap());
//        System.out.println(        DateTime.now());

//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//        DateTime dateTime = new DateTime(time);
//        dateTime = dateTime.plusDays(10);
//        System.out.println(dateTime.toString("yyyy-MM-dd"));
        DateTime dateTime  = new DateTime();
//        DateTime dateTime1 = dateTime.plusYears(1).withDayOfYear(1);
        DateTime dateTime2 = dateTime.plusYears(1).withDayOfWeek(6);

        System.out.println(dateTime2.toString("EE yyyy-MM-dd"));
//        System.out.println(Days.daysBetween(dateTime, dateTime1).getDays());
//        int[] array = new int[2];
    }
    
    
}