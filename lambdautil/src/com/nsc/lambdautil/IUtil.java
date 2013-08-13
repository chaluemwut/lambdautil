package com.nsc.lambdautil;

/**
 * Created with IntelliJ IDEA.
 * User: chaluemwut
 * Date: 8/13/13
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IUtil<T> {
    public <T> void visit(T item, int index);
}
