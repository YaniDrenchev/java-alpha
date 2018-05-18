package com.compan;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StaticQueue {

    int[] data;
    int head;
    int tail;

    public StaticQueue() {
        data = new int[10];
        head = -1;
        tail = 0;
    }

    public boolean isEmpty() {
        return head == -1 || tail > head;
    }

    public void enqueue(int x) {
        head++;
        if (head == data.length) {
            resizeData();
        }
        data[head] = x;
    }

    public int dequeue() {
        if (!isEmpty()) {
            return data[tail++];
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (head<tail){
            throw new EmptyStackException();
        }
        if (!isEmpty()) {
            return data[tail];
        }
        throw new EmptyStackException();
    }

    private void resizeData() {
        data = Arrays.copyOf(data, data.length * 2);
    }
}


