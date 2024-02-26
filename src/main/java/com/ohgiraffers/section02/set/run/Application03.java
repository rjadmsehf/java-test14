package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application03 {

    public static void main(String[] args) {

        /* 목표. TreeSet 에 대해 이해하고 사용할 수 있다. */
        /* 필기
            TreeSet 클래스
            데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
         */

        TreeSet<String > tset = new TreeSet<>();
        
        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        // 자동 오름파순 정렬이 됨.
        System.out.println("tset = " + tset);

        /* 로또 번호 발생 */
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 7) {

            lotto.add((int) (Math.random() * 45) +1);

        }

        System.out.println("lotto = " + lotto);
    }
}
