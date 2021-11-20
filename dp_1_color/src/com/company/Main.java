package com.company;

/*
r=3 | 1 0 0
r=2 | 0 1 1
r=1 | 1 0 0
     _______
  c=  1 2 3

  solve

 */
public class Main {
    static int col[][] = new int[5][5];

    static void init() {
        for(var i : col)
            for(var j : i)
                j=0;
    }

    static void set() {

    }

    static void change(int r, int c) {
        if(col[r][c] == 0)  col[r][c] = 1;
        col[r][c] = 0;
    }

    static void reverse(int r, int c) {
        change(r, c);
        change(r-1, c);
        change(r, c-1);
        change(r+1, c);
        change(r, c+1);
    }

    public static void main(String[] args) {

    }
}

