package com.vld;

import com.vld.array.AstArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AstArrayList<Integer> list = new AstArrayList();
        list.add(5, 1);
        list.add(8, 5);
        list.add(7, 5);
        list.remove(5);
    }
}
