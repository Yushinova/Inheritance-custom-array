package org.top;

import org.top.classes.IntArray;
import org.top.classes.IntQueue;
import org.top.classes.IntStack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void testIntArray() {
        Integer[] myNum = {10, 20, 30, 40};
        IntArray arr = new IntArray(myNum);
        System.out.println(arr.toString());
        System.out.println("Элемент 2го индекса: " + arr.getElement(2));
        arr.setElement(0, 100);
        System.out.println("После установки нового элемента на индекс 0");
        System.out.println(arr.toString());
    }

    public static void testIntStack() {
        IntStack newAr = new IntStack();
        newAr.setTop(2);
        newAr.setTop(25);
        System.out.println(newAr.toString());
        System.out.println("Первый элемент: " + newAr.getTop());
        newAr.deleteTop();
        System.out.println("После удаления первого элемента в стеке");
        System.out.println(newAr.toString());
    }

    public static void testQueue() {
        IntQueue q = new IntQueue(3);
        System.out.println(q.toString());
        q.pushEnd(10);
        q.pushEnd(20);
        System.out.println(q.toString());
        q.getTop();
        System.out.println(q.toString());
        q.getTop();
        System.out.println(q.toString());
        q.getTop();
    }

    public static void main(String[] args) {
        testIntArray();
        testIntStack();
        testQueue();
    }
}