package com.nsc.lambdautil.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: chaluemwut
 * Date: 8/27/13
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumList {

    public static void main(String [] args){
        List<Integer> lst = Arrays.asList(1,2,3,4,5,10,20,30);
        List<Integer> newList = lst.stream().filter(p -> p >= 10).collect(Collectors.toList());
        newList.forEach(p->System.out.println(p));
    }
}
