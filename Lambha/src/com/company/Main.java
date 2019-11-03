package com.company;

interface FuncInterface{

    // this is abstract function
    void abstractFun (int x);
    //no abstract class
    default void normalfun(){
        System.out.println("Hello");
    }
}

public class Main {

    public static void main(String[] args) {
        // membuat lambha dimana object x akan di kali dua yang natinya akan di definisikan kedalam method abstractFun di intreface
	    FuncInterface fobj = (int x)-> System.out.println(2*x);
	    // memberi nilai dari x
//        int y=5;
//        int x= y*2;
	    fobj.abstractFun(5);
    }
}
