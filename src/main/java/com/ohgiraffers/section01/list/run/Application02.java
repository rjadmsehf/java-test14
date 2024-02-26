package com.ohgiraffers.section01.list.run;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {

        /* 목표 LinkedList 에 대해 이해하고 사용할 수 있다. */
        /* 필기.
            LinkedList
            ArrayList 가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안됨
            내부는 이중 연결 리스트로 되어있다.
         */
        /* 필기
            이중 연결 리스트
            : 단일 연결 리스트는 다음 요소만 링크(주소 참조)하는 반면 이중 연결 리스트는
              이전 요소도 링크하여 이전 요소로 접근하기 쉽게 고안된 자료구조이다.
         */
        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());

        for (int i = 0 ; i < linkedList.size(); i++){
            System.out.println(i + "  :  " + linkedList.get(i));
        }

        linkedList.remove(1);

        linkedList.set(0, "fineapple");

        System.out.println("linkedList = " + linkedList);

        // 비었니?
        System.out.println(linkedList.isEmpty());
        
        linkedList.clear();

        System.out.println( linkedList.isEmpty());
        
        
    }
}
