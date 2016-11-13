package com.butter.download2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by butter on 16-11-5.
 */
public class Download2 {

    public static void  main(String[] args) throws IOException {
        URL[] urls = {
                new URL("http://www.baidu.com"),
                new URL("http://news.baidu.com"),
                new URL("http://map.baidu.com"),
                new URL("http://www.hao123.com"),
                new URL("http://www.zhihu.com")
        };

        String[] names = {
                "baidu.html",
                "news.html",
                "map.html",
                "123.html",
                "zhihu.html"
        };
//
//        for(int i = 0; i < urls.length; i++){
//            dump(urls[i].openStream(), new FileOutputStream(names[i]));
//        }

        for(int i = 0; i < urls.length; i++){
            int index = i;

            new Thread(()->{
                try {
                    dump(urls[index].openStream(), new FileOutputStream(names[index]));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
    private static void dump(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] data = new byte[1024];
        int length;
        while ((length = inputStream.read(data)) != -1) {
            try {
                fileOutputStream.write(data, 0, length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
