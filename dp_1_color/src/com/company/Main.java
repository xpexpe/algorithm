package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
r=3 | 1 0 0
r=2 | 0 1 1
r=1 | 1 0 0
     _______
  c=  1 2 3

  solve : 5x5 -> 1~3 index search

 */
public class Main {
    static int col[][] = new int[5][5];
    static int check = 1;
    static int end = -1;
    static void init(){
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                col[i][j] = 0;
            }
        }
    }

    static void change(int r, int c) {
        if(col[r][c] == 0)  col[r][c] = 1;
        else col[r][c] = 0;
    }

    static void reverse(int r, int c) {
        change(r, c);
        change(r-1, c);
        change(r, c-1);
        change(r+1, c);
        change(r, c+1);
        int sum = 0;
        for(int i=1; i<4; i++) {
            for(int j=1; j<4; j++) {
                sum += col[i][j];
            }
        }
        if(sum == 0 || sum == 9) end = check;
        check++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        init();
        for(int i=1; i<4; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<4; j++) {
                col[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            reverse(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            if(end>0)   break;
        }

        System.out.println(end);
    }
}

