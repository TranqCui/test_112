package cn.getRoom;

import javax.persistence.Temporal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by cuibinbin on 2017/11/15.
 */
public class getRoom_1 {
    public static void main(String[] args){
        try {
//            URL url = new URL("http://202.120.82.2:8081/ClientWeb/pro/ajax/login.aspx");
            URL url = new URL("http://202.120.82.2:8081/ClientWeb/xcus/ic2/Default.aspx");

            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK){
                System.out.println("success!!!!");
                InputStream in  = httpURLConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);
                String str;
                while ((str = br.readLine())!= null){
                    System.out.println(str);
                }
                br.close();
            }else {
                System.out.println("defeat!!!");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
