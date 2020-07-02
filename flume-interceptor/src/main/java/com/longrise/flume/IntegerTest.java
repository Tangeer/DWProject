package com.longrise.flume;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;

        String aa = "aa";
        String bb = "aa";

        String aaa = new String("aa");
        String bbb = new String("aa");

        System.out.println("=====================");
        if (a == b){
            System.out.println("类a等于类b");
        }else{
            System.out.println("类a不等于类b");
        }

        if (a.equals(b)){
            System.out.println("类a等于类b");
        }else{
            System.out.println("类a不等于类b");
        }
        System.out.println("=====================");
        if (aa == bb){
            System.out.println("类aa等于类bb");
        }else{
            System.out.println("类aa不等于类bb");
        }

        if (aa.equals(bb)){
            System.out.println("类aa等于类bb");
        }else{
            System.out.println("类aa不等于类bb");
        }

        System.out.println("=====================");
        if (aaa == bbb){
            System.out.println("类aaa等于类bbb");
        }else{
            System.out.println("类aaa不等于类bbb");
        }

        if (aaa.equals(bbb)){
            System.out.println("类aaa等于类bbb");
        }else{
            System.out.println("类aaa不等于类bbb");
        }






    }
}
