package com.company;

public class IntQueue {
    private int[] q;
    private int total;
    private int size;
    private int front;
    private int rear;

    public IntQueue(){
        total = 0;
        size = 0;
        front = 0;
        rear = 0;
        q = new int[size];
    }

    public IntQueue(int size){
        total = 0;
        this.size = size;
        front = 0;
        rear = 0;
        q = new int[this.size];
    }

    public boolean enqueue(int item){
        if(!isFull()){
            q[rear] = item;
            rear++;
            total++;
            System.out.println(item + "  ENQUEUED");
            return true;
        }else{
            return false;
        }
    }

    public boolean dequeue(){
        int item = q[front];
        front++;
        total--;
        System.out.println(item + " DEQUEUED");
        return true;
    }

    public boolean isFull(){
        return(this.total == this.size);
    }
}
