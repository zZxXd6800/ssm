package com.atguigu.spring.dependency;

/**
 * @author zhuxu
 * @date 2020/7/19 21:40
 */
public class ClassA {
    private ClassB b;

    public ClassA() {
    }

    public ClassA(ClassB b) {
        this.b = b;
    }

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }
}
