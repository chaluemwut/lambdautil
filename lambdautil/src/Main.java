import com.nsc.lambdautil.LambdaUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class Main {

    public static <T> void printItem(T item,int index){
        String ret = "Value "+item+" : index "+index;
        System.out.println(ret);
    }
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Thread t1 = new Thread(()->{
//            for(int i=0;i<10;i++) {
//                System.out.println("i "+i);
//            }
//        });
//        t1.start();
        List<Integer> newList = new ArrayList<>();
        List<Integer> lst = Arrays.asList(1,2,10,30,2);
        lst.forEach(p->System.out.println(p));
        //newList.forEach(p->System.out.println(p));
        //lst.stream().filter(p->p>=10).forEach(p->System.out.println(p));
        //lst.stream().forEach(p->System.out.println(p));
        //LambdaUtil.printWithIndex(lst, Main::printItem);
        //LambdaUtil.printWith(lst,p->p>3);
       // System.out.println(LambdaUtil.toStringWith(lst,p->p>3));
    }
}
