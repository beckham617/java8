package com.liang.hackerrank.practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int sum = 1;
        int res = 0;
        int[] rem = new int[ar.length];
        for(int j=0;j<ar.length;j++){
        	//???????????
        	boolean flag = false;
        	for(int val : rem) {
        		if(val == ar[j]) {
        			flag=true;
        			break;
        		}
        	}
        	if(flag == true) {
        		continue;
        	}
            for(int k =j+1;k<ar.length;k++){
                if(ar[k]==ar[j]){
                    sum++;
                }
            }
            res = res + sum/2;
            rem[j]=ar[j];
            sum=1;
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    	int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//        int n=9;
//        int[] ar= {10,20,20,10,10,30,50,10,20};
    	
//        int n=10;
//        int[] ar= {1,1,3,1,2,1,3,3,3,3};
    	
        int n=5;
        int[] ar= {10 ,20 ,50 ,30 ,40};
        
        int result = sockMerchant(n, ar);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
