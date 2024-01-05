package Comparator_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String>cmp=(str1,str2)-> str2.compareTo(str1);//Descending Order
        //Comparator<String>cmp=(str1,str2)-> str1.compareTo(str2);//Ascending Order
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Dipak");
        arr.add("Rohan");
        arr.add("Dk");
        arr.add("Rutwij");
        arr.add("Harsh");

        System.out.println("Before Sorting:"+ arr);
        Collections.sort(arr,cmp);
        System.out.println("Sorted List of String is:"+arr);
    }
}
