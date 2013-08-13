package com.nsc.lambdautil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: chaluemwut
 * Date: 8/13/13
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class LambdaUtil {

    public <T> int sumAll(Collection<T> lst, CollectionSum sumOperation){
        for(T t:lst){
        }
        return 0;
    }

    public static <T> String toStringWith(Collection<T> lst, Predicate<T> tester){
        String ret = "[";
        for(T t:lst){
            if(tester.test(t)) {
                ret+=t+",";
            }
        }
        ret = ret.substring(0,ret.length()-1);
        return ret+"]";
    }

    public static <T> void printWith(Collection<T> lst, Predicate<T> tester){
        for(T t:lst){
            if(tester.test(t)){
               System.out.println(t);
            }
        }
    }

    public static interface ItemWithIndexVisitor<E> {
        public void visit(E item, int index);
    }

    public static <T> void printWithIndex(List<T> lst, ItemWithIndexVisitor<T> visit){
        for(int i=0;i<lst.size();i++){
           visit.visit(lst.get(i),i);
        }
    }


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
