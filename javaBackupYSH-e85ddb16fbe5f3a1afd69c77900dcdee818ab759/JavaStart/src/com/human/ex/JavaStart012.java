package com.human.ex;

public class JavaStart012 {
    public static void main(String args[]) {
        System.out.println("변수 문제1-------------------------------");
        String name="홍길동";
        int age=29;
        int height=170;
        System.out.println("이름 : "+name+" 나이 : "+age+" 키 : "+height);

        System.out.println("문제2-------------------------------");
        byte Byte=1;//-128~127까지의 정수
        short Short=30000;//-32768~32767까지의 정수
        int Integer=1;//-2147483648~2147483647까지의 정수
        long longnumber=2^60;//-2^63~2^63-1까지의 정수
        float Float=1.23f;//실수
        double Double=1.2345d;//float보다 범위가 더 큰 실수
        char C='a';//문자 1개
        String s="asd";//문자열
        boolean Bool=true;//true, false 
        
        System.out.println("문제3-------------------------------");
//        10 : 정수
//        1. : 실수
//        6f : 실수
//        23d : 실수
//        14e10 : 실수
//        'a' : 문자
        
        System.out.println("문제4-------------------------------");
        int a=5;
        int b=10;
        a=a+3;
        System.out.println(a+b);
        
        System.out.println("형변환 문제1-------------------------------");
//        1 : 뒤에 f를 붙이지 않음 ->1.234f
//        2,3 : short는 정수를 저장
//        4 : char는 문자 1개를 저장
//        5,6 : int는 정수를 저장
        
        System.out.println("문제2-------------------------------");
        System.out.println("1)"+3+3+"hello");//33hello -> 문자와 더해진 숫자는 문자로 취급
        //System.out.println("2)"+3*"hello"); -> 정수와 문자열을 서로 곱할 수 없음(오류)
        System.out.println("3)"+"hello"+4+4);//hello44
        
        System.out.println("문제3-------------------------------");
        //쌍따옴표는 문자열을 저장할 때 사용
        //double은 숫자의 뒤에 d를 붙여 표시
        
        System.out.println("문제4-------------------------------");
        name="홍길동";
        age=5;
        System.out.println("이름은 "+name+" 나이는 "+age+" 입니다.");
    }
}
