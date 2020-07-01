package com.collections;

public class MyCollectionDemo {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.printCollection();
        System.out.println(collection.max());

        collection.remove(0);
        collection.printCollection();
        System.out.println(collection.min());

        System.out.println(collection.avg());

        System.out.println(collection.contains(-1));
    }

}
