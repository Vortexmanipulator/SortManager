package com.sparta.dr.start;

public class SortTimer {


    public static double timeBeforeSort(){
        double start = start = System.nanoTime();
        return start;

    }
    public static double timeAfterSort(){
        double finish = System.nanoTime();

        return finish;
    }

    public static double getDuration(double finish, double start){
        return (finish - start)/1_000_000;
    }

}
