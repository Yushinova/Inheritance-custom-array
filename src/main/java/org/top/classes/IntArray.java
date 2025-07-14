package org.top.classes;

import java.util.Arrays;
import java.util.Random;

public class IntArray {
    public Integer[] array;

    //инициализация пустого массива
    public IntArray(Integer[] array) {
        this.array = array;
    }

    public IntArray(int size) {
        this.array = new Integer[size];
    }

    public void setRandom(Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    //получение элемента по индексу
    public Integer getElement(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Индекс вне диапазона массива");
            return null;
        }
        return this.array[index];
    }

    //установка элемента по индексу
    public void setElement(int index, int element) {
        if (index < 0 || index >= array.length) {
            System.out.println("Индекс вне диапазона массива");
            return;
        }
        this.array[index] = element;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
