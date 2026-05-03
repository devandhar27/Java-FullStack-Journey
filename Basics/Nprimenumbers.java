package com.ArrayPrac;

import java.util.Scanner;
public class Nprimenumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=2;
		int count=0;
		//int N=sc.nextInt();
		while(count<20) {
			if(isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
