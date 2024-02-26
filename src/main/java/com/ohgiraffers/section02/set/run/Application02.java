package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application02 {

    public static void main(String[] args) {
        
        /* 목표. LinkedHashSet 에 대해 이해하고 사용할 수 있다. */ 
        /* 필기
            LinkedHashSet 클래스
            추가적으로 저장 순서를 유지하는 특징을 가지고 있다.  
         */

        LinkedHashSet<String > lhset =new LinkedHashSet<>();
        
        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset = " + lhset);
    }
}
