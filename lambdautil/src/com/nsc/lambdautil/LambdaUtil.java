package com.nsc.lambdautil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: chaluemwut
 * Date: 8/13/13
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class LambdaUtil {

    public static <T> Collection<T> filter(Collection<T> lst, Predicate<T> tester){
        Collection<T> ret = new ArrayList<T>();
        for(T t:lst){
            if(tester.test(t)){
                ret.add(t);
            }
        }
        return ret;
    }
}
