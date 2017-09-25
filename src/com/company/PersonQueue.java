package com.company;

public class PersonQueue {
    private Person[] q;
    private int total;
    private int size;
    private int front;
    private int rear;

    public PersonQueue(){
        total = 0;
        size = 0;
        front = 0;
        rear = 0;
        q = new Person[size];
    }

    public PersonQueue(int size){
        total = 0;
        this.size = size;
        front = 0;
        rear = 0;
        q = new Person[this.size];
    }

    public boolean enqueue(Person item){
        if(!isFull()){
            q[rear] = item;
            rear++;
            total++;
            System.out.println(item.toString() + " -->  ENQUEUED");
            return true;
        }else{
            return false;
        }
    }

    public boolean dequeue(){
        Person item = q[front];
        front++;
        total--;
        System.out.println(item.toString()+" -->  DEQUEUED");
        return true;
    }

    public boolean isFull(){
        return(this.total == this.size);
    }
}
