package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.treverse(list.getRoot());

        String stringData = "Anton Iarina Liubov Mikhail Tatiana Marina";

        String[] data = stringData.split(" ");

        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.treverse(list.getRoot());
        list.removeItem(new Node("Tatiana"));
        list.treverse(list.getRoot());

       // SearchTree tree = new SearchTree(null);
    }
}
