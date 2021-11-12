package com.company;

import java.util.Arrays;

public class Array {

    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for (int i = 0; i < count; i++)
        System.out.println(items[i]);
    }

    public void insert (int item){
        //if array is full, resize it
        if (count == items.length){
            int[] newArray = new int[count + 2];

            for(int i = 0; i < count; i++){
                newArray[i] = items[i];
            }

            items = newArray;
        }

        //add new item at the end
        items[count++] = item;

    }

    public void removeAt(int index){
        if (index < 0 || index >= count )
            throw new IllegalArgumentException();

        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int number){
        int index = -1;

        for(int i = 0; i < items.length; i++){
            if (items[i] == number){
                index = i;
            }
        }

        return index;
    }
}
