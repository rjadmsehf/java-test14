package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application02 {

    public static void main(String[] args) {
        
        /* 목표 Properties 에 대해 이해하고 사용할 수 있다. */ 
        /* 필기.
            Properties 란?
            Hashmap 을 구현하여 사용 용법이 거의 유사하지만 key 와 value 모두 문자열만
            사용할 수 있는 자료구족 이다.
            설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
         */

        Properties prop = new Properties();
        
        prop.setProperty("driver" , "com.mysql.jdbc.Driver");
        prop.setProperty("url" , "jdbc:mysql://localhost/menu");
        prop.setProperty("user" , "ohgiraffers");
        prop.setProperty("password" , "ohgiraffers");

        try {
            prop.store(new FileOutputStream("driver.dat") ,"jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml") , "jdbc driver");

            /* 필기  try 구문안에 내용이 실행 될 때 예외가 발생하면
                    catch 구문으로 이동해서 예외를 발생시킴*/

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("prop = " + prop);

        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.list(System.out);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
