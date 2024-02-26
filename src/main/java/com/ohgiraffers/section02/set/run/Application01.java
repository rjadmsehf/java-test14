package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {

    public static void main(String[] args) {

        /* 목표. Set 자료구조의 특성을 이해하고 hashMap 을 이용할 수 있다. */
        /* 필기
            Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
            1. 요소의 저장 순서를 유지하지 않는다.
            2. 같은 요소의 중복 저장을 허용하지 않는다.

            필기
              hashSet 클래스
              Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 증 하나이다.
         */

        HashSet<String > hset = new HashSet<>();

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset = " + hset);

        hset.add("java");

        System.out.println("hset = " + hset);

        System.out.println("포함하고 있는 지  : " + hset.contains("mysql"));

        /* 목차. 1. toArray() : 배열로 바꿈 */ //필기 별로 신경 안써도댐

        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++){
            System.out.println(i +" : " + arr[i]);
        }

        /* 목차. 2. iterator() 로 목록을 만들어 연속 처리 */

        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
