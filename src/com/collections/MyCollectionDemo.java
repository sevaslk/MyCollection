package com.collections;

public class MyCollectionDemo {
    public static void main(String[] args) {
        ListAddRemoveModified collection = new ListAddRemoveModified();
        collection.addMod(1);
        collection.addMod(2);
        collection.addMod(3);
        collection.addMod(4);
        collection.printCollection();
        System.out.println(collection.max());

        collection.removeMod(0);
        collection.printCollection();
        System.out.println(collection.min());

        System.out.println(collection.avg());

        System.out.println(collection.contains(-1));
    }

}
