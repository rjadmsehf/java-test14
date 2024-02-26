package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application04 {

    public static void main(String[] args) {
        
        /* 목표 Queue 에 대해 이해하고 사용할 수 있다. */
        /* 필기.
            Queue 는 선형 메모리 공간에 데이터를 저장하는 
            선입선출(FIFO - First In First Out )
            Queue 는 인터페이스이기 때문에 LinkedList 로 인스턴스를 생성한다.    
         */

        Queue<String> que = new LinkedList<>();
        
        /* Queue 에 데이터를 넣을 때는 offer() 를 이용한다. */ 
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /* 필기
            큐에서 데이터를 꺼내는 방식
            peek() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소) 를 반환.
            poll() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소) 를 반환 후 제거
         */

        System.out.println("peek() : " + que.peek());
        System.out.println("peek() : " + que.peek());

        System.out.println("que = " + que);

        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());

        System.out.println("que = " + que);
    }
    
}
