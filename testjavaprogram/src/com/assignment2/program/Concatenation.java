package com.assignment2.program;
//Return string concatenation
class Concate
{
    String returnString(String[] a)
    {
        String s="";
        for(String val : a)
            s = s + val + " ";
        return s;
    }
}
public class Concatenation {
    public static void main(String[] args) {
        String[] s = {"I","am","vidya","shree"};
        Concate o =new Concate();
        String ans = o.returnString(s);
        System.out.println("Concatenated  string ==>"+ans);
    }
}

  