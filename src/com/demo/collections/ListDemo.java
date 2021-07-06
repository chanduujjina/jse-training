package com.demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

public static void main(String[] args) {
  //static form crearing array
int arr[] = {1,2,3,5};

//dynamic way of creating arrys
int arr1[] = new int[10];
for(int i=0;i<10;i++) {
arr1[i]=i;
}

//creating a list
List list = new ArrayList();
// adding elements to the list
list.add(1);

list.add("chandu");

list.add(1d);

list.add("chandu");


// to fetch elements from the list
for(Object obj : list) {
System.out.println(obj);
}

//how to get particular index value from list

String name =(String) list.get(1);

System.out.println(name);

// by giving value you can index also

int index= list.indexOf("chandu");
System.out.println(index);

int lastindex=  list.lastIndexOf("chandu");
System.out.println(lastindex);

boolean val =list.contains(1);
System.out.println(val);

//how to create sublist

List sublist1 =list.subList(0, 2);
List sublist2 =list.subList(2, 4);

System.out.println(sublist1);
System.out.println(sublist2);


//remove element from the collections
list.remove(3);
System.out.println(list);



//
List integerList = new ArrayList();
for(int i=1;i<=10000;i++) {
integerList.add(i);
}

System.out.println(integerList);

//what is fail fast// question

List linkedlist = new LinkedList<>();

linkedlist.add(1);

linkedlist.add(2);

linkedlist.add(3);

linkedlist.add(4);

System.out.println(linkedlist);

linkedlist.indexOf(1);






}



}

