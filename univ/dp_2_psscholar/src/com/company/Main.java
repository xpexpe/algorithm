package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Scholar {
    static int N;
    static int dp[][];
    // dp로 사용될 배열 : Size = 3 X N

    static void init(int arr[][], int N) {
        dp = new int[3][N];
        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        dp[2][0] = 0;
    }

    public static int rec(int cas, int pos) {
        /*
        현재까지의 최대값 계산(현 상황에서의) 후 리턴
        case 0 ) 1학기 장학금 수여
        case 1 ) 2학기 장학금 수여
        case 2 ) 장학금 수여 X
         */
        if(cas == 0)
            return Integer.max(dp[1][pos-1], dp[2][pos-1]);
        else if(cas == 1)
            return Integer.max(dp[0][pos-1], dp[2][pos-1]);
        else
            return Integer.max(dp[0][pos-1], dp[1][pos-1]);
    }

    public static void printmax() {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<3; i++) {
            if (dp[i][N - 1] > max) max = dp[i][N - 1];
        }
        System.out.println(max);
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Scholar.N = N;

        int sch[][] = new int[2][N];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            sch[0][i] = Integer.parseInt(st.nextToken());
            sch[1][i] = Integer.parseInt(st.nextToken());
        }

        Scholar.init(sch, N);


        for(int i=1; i<N; i++) {
            for(int m=0; m<3; m++) {
                if(m==2)     {
                    Scholar.dp[m][i] = Scholar.rec(m, i);
                    continue;
                }
                Scholar.dp[m][i] = Scholar.rec(m, i) + sch[m][i];
            }
        }

        Scholar.printmax();

    }
}
