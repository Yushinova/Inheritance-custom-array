package org.top.classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntStack extends IntArray {
    public int lenghtStack;

    public IntStack() {
       super(0);
       lenghtStack = 0;
    }

    public int getLenghtStack() {
        return lenghtStack;
    }

    public void setTop(int element) {
        Integer[] temp = new Integer[array.length + 1];
        temp[0] = element;
        System.arraycopy(array, 0, temp, 1, array.length);
        array = temp;
        lenghtStack ++;
    }
    public boolean isEmpty(){
        return array.length==0;
    }
    public Integer getTop(){
        if(isEmpty()){
            throw new IllegalArgumentException("Стек пуст");
        }
        return getElement(0);
    }
    public void deleteTop(){
        if(isEmpty()){
            throw new IllegalArgumentException("Стек пуст");
        }
        Integer[] temp = new Integer[array.length - 1];
        System.arraycopy(array, 1, temp, 0, array.length - 1);
        array = temp;
        lenghtStack--;
    }
    @Override
    public String toString(){
        return "Размер стека = "+lenghtStack+", "+ super.toString();
    }
}
