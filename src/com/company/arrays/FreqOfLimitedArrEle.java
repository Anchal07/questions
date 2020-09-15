package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FreqOfLimitedArrEle {

    public void freq(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=scanner.nextInt();
        Arrays.stream(arr).sorted();
        int counter=arr[0], freq=1;
        for(int i=0; i<n;){
            if((arr[i]!=0 || arr[i]-arr[i-1]-1==counter) && counter>0){
                if(counter!=1){
                    System.out.println(0);
                    counter--;
                }
            } else{
                if(arr[i] == arr[i+1]){
                    freq++;
                    i++;
                }
                else if(i+1<n && arr[i] != arr[i+1]){
                    System.out.println(freq);
                    if(arr[i+1]-arr[i]==1)
                        freq=1;
                    else
                        counter=arr[i+1]-arr[i]-1;
                    i++;
                }
            }
        }
    }
}
