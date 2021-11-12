package com.company;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty(){
        return first == null;
    }

    //addFirst
    public void addFirst(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    //addLast
    public void addLast(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }


    }


    //deleteFirst
    public void removeFirst(){
        Node second;
        if (!isEmpty()){
            second = first.next;
            first.next = null;
            first = second;
        }else if(first == last){
            first = last = null;
            return;
        }
        else
            throw new NoSuchElementException();
    }

    //deleteLast
    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        else if(first == last) {
            first = last = null;
            return;
        }
        Node current = first;
        Node previous;

        while (current != null){
            if (current.next == last){
                previous = current;
                last = previous;
                last.next = null;
            }
            current = current.next;
        }
    }

    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //indexOf
    public int indexOf(int item){
        int index = 0;
        Node current = first;

        while(current != null){
            if(current.value == item){
                return index;
            }else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }
}
