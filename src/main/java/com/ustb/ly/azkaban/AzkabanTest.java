package com.ustb.ly.azkaban;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author LinYue
 * @email ustb2021@126.com
 * @create 2021-03-13 10:57
 */
public class AzkabanTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/home/centos/software/azkaban/myDatas/java.txt");
            fos.write("I am LinYue".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
