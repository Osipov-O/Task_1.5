package com.company;

public class Main {

    public static void main(String[] args) {
	int t=5500;
    int h=t/3600;
    int m=t%3600/60;
    int s=t%60;
    System.out.println(h+"ч "+m+"м "+s+"с");
    }
}
