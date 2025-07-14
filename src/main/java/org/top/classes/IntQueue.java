package org.top.classes;

import java.util.Arrays;

public class IntQueue extends IntArray {
    public int sizeQueue;
    public int sizeFact;

    //Инициализируется null, очередью будут считаться все, которые не null
    public IntQueue(int size) {
        super(size);
        sizeQueue = size;
        sizeFact = 0;
    }

    public int getSizeQueue() {
        return sizeQueue;
    }

    public int getSizeFact() {
        return sizeFact;
    }

    public void pushEnd(Integer element) {
        if (sizeFact >= sizeQueue) {
            throw new IllegalArgumentException("В очереди нет места");
        }
        Integer[] temp = new Integer[array.length];
        //Копируем первую половину
        System.arraycopy(array, 0, temp, 0, sizeFact);
        temp[sizeFact] = element;
        // Копируем вторую половину
        System.arraycopy(array, sizeFact, temp, sizeFact + 1, array.length - sizeFact - 1);
        array = temp;
        sizeFact++;
    }

    public boolean isEmpty() {
        return sizeFact == 0;
    }

    public void getTop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Очередь пуста");
        }
        Integer[] temp = new Integer[array.length - 1];
        System.arraycopy(array, 1, temp, 0, array.length - 1);
        array = temp;
        sizeFact--;
        addToEnd(null);
    }

    public void addToEnd(Integer element) {
        Integer[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        array = newArray;
    }

    @Override
    public String toString() {
        return "Размер очереди: " + sizeQueue + ", Размер факт: " + sizeFact +
                ", " + super.toString();
    }
}
