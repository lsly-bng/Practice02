package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("키와 뭄무게를 입력해주세요.");

		System.out.print("키: ");
		double h = sc.nextDouble();
		
		System.out.print("몸무게: ");
		double w = sc.nextDouble();
		
		double avg = (h-100)*0.9;
		
		if(w<avg) {
			System.out.println("저체중 입니다.");
		}
		else if(w>avg) {
			System.out.println("과체중 입니다.");
		}
		else if(w==avg) {
			System.out.println("표준 입니다.");
		}

		System.out.println("표준체중: "+avg);
		
		sc.close();
		
		}
	}

