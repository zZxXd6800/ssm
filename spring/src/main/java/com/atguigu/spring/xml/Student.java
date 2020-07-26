package com.atguigu.spring.xml;

import java.util.*;

/**
 * @author zhuxu
 * @date 2020/7/15 15:29
 */
public class Student {

    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties prop;

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n\tarray=" + Arrays.toString(array) +
                "\n\tlist=" + list +
                "\n\tset=" + set +
                "\n\tmap=" + map +
                "\n\tprop=" + prop +
                "\n}";
    }
}
