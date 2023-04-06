package com.isvaso;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Напишите Java-программу для обхода ArrayList с использованием цикла for,
 * while и улучшенного цикла for
 */
public class WhileAndForArrayListIteration {

    public static <T> void whileIteration(ArrayList<T> arrayList) {
        Iterator<T> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static <T> void forIteration(ArrayList<T> arrayList) {
        if (arrayList.size() > 1) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static <T> void forEachIteration(ArrayList<T> arrayList) {
        for (T value : arrayList) {
            System.out.println(value);
        }
    }
}
