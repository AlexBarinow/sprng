package com.example.sprng.algorithms.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addLast("Hello");
        ll.addLast("Heldfdflo");
        ll.addLast("Hdfdfello");
        ll.addLast("Hfdfdfello");
        ll.addLast("Hefdllo");


        System.out.println(ll.get("Hefdllo"));
        ll.remove("Hdfdfello");
        System.out.println(ll.get("Hefdllo"));

    }
}
