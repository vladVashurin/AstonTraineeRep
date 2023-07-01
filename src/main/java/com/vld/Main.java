package com.vld;

import com.vld.array.AstArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AstArrayList<String> list = new AstArrayList<String>();
        List<String>strings = new ArrayList<>();
        strings.add("макасим");
        strings.add("иля");
        list.add(0, "Миша");
        list.add(1, "Вова");
        list.add(2, "Бобик");
        list.add(3, "Бобс");
        list.addAll(strings);
        //list.clear();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
