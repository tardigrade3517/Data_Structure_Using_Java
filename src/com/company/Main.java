package com.company;

public class Main {

    public static void main(String[] args) {
        /*   Testing IntStack
        IntStack intStack = new IntStack(2);
        System.out.println("Empty :" +intStack.isEmpty());
        System.out.println(intStack.push(3));
        System.out.println(intStack.push(5));
        System.out.println("Full :" +intStack.isFull());
        System.out.println(intStack.pop()); */

        // Array Store of Persons
        Person person1 = new Person("Ram",1);
        Person person2 = new Person("Shyam",2);
        Person person3 = new Person("Ghanshyam",3);
        Person person4 = new Person("Raghu",4);

        Person[] PersonsAvailable = new Person[4];
        PersonsAvailable[0] = person1;
        PersonsAvailable[1] = person2;
        PersonsAvailable[2] = person3;
        PersonsAvailable[3] = person4;
        
        /* Testing PersonStack
        PersonStack personStack = new PersonStack(2);
        System.out.println(personStack.isEmpty());
        System.out.println(personStack.push(person1));
        System.out.println(personStack.push(person2));
        System.out.println(personStack.isFull());
        System.out.println(personStack.pop().toString());
        System.out.println(personStack.pop().toString());
        System.out.println(personStack.pop()); */

        /* Testing IntQueue
        IntQueue intq = new IntQueue(3);
        for(int i =1;i<4;i++){
            intq.enqueue(i);
        }

        for (int i = 1; i < 4; i++) {
            intq.dequeue();
        }*/
        
        // Testing PersonQueue
        PersonQueue personQueue = new PersonQueue(4);
        for(int i =0;i<4;i++){
            personQueue.enqueue(PersonsAvailable[i]);
        }
        for (int i = 0; i < 4; i++) {
            personQueue.dequeue();
        }
    }
}
