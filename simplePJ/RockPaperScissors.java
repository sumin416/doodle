package com.ssafy.ws.step01;

import java.util.Scanner;

//가위바위보 게임
public class GameTest {
	//1:가위, 2:주먹, 3:보
	
	public static void main(String[] args) {
		
		int max=0;
		int Win=0,Lose=0;
		int randN = 0; // 1~3 사이 숫자 생성
		int input_n=0;
		
		String whowin="이겼습니다!";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		
		System.out.print("번호를 입력하세요. ");
		int no = sc.nextInt();
		
		switch(no) {
			case 1: 
				max=3;
				break;
			case 2:
				max=2;
				break;
			case 3:
				max=1;
				break;	
		}
		System.out.println(max);
		while(Win < max && Lose < max ) {
			
			whowin="이겼습니다!";
			
			System.out.print("가위바위보 중 하나 입력. ");
			String input = sc.next();  // sc.nextLine()은 안되는 이유는?
			
			switch(input) {
			case "가위":
				input_n=1;
				break;
			case "주먹":
				input_n=2;
				break;
			case "보":
				input_n=3;
				break;	
			}
			//randN = (int)(Math.random()*3+1);
			randN = (int)(Math.random()*1000%3)+1;
			
			if(input_n==1&&randN==3) {
				++Win;
			}
			else if(input_n==3&&randN==1) {
				++Lose;
				whowin="졌습니다!";
			}
			else {
				if(input_n>randN) {
					++Win;
				}
				else if(input_n<randN) {
					++Lose;
					whowin="졌습니다!";
				}
				else
					whowin="비겼습니다!";
			}
			
			System.out.println(whowin);
			
		}
		
		String winner;
		
		if(Win>Lose)	winner="사용자 승";
		else	winner="컴퓨터 승";
		
		System.out.println("###"+winner);
		
	}

}
