package com.atguigu.spring.dependency;

/**
 * @author zhuxu
 * @date 2020/7/19 21:40
 */
public class ClassB {

    private ClassA a;

    public ClassB() {
    }

    public ClassB(ClassA a) {
        this.a = a;
    }

    public ClassA getA() {
        return a;
    }

    public void setA(ClassA a) {
        this.a = a;
    }
}
