package com.javaex.phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//안된거
//저장 값 마지막으로 출력
public class PhoneDb {

	public static void main(String[] args) throws IOException {
		
		List<Person> pList = new ArrayList<Person>();
		//파일 읽어옴.
		Reader rd = new FileReader("C:\\Users\\USER\\Downloads\\미니프로젝트\\phoneDB.txt");
		BufferedReader br = new BufferedReader(rd);
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		String hp = null;
		String company = null;
			
		System.out.println("***************************************************");
		System.out.println("*		 전화 번호 관리 프로그램	   	  *");
		System.out.println("***************************************************");
		
		System.out.println("1. 리스트   2. 등록    3. 삭제   4. 검색   5. 종료");
		System.out.println("---------------------------------------------------");
		System.out.print(">메뉴번호 :");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("<1.리스트>");
		}else if(num == 2) {
			System.out.println("<2.등록>");
		}else if(num == 3) {
			System.out.println("<3.삭제>");
		}else if(num == 4) {
			System.out.println("<4.검색>");
		}else if(num == 5) {
			System.out.println("<5.종료>");
		}
		
		while(true) {
		
			
			if(num == 5) {
				System.out.println("*************************************");
				System.out.println("*           감사합니다.*             ");
				System.out.println("*************************************");
				break;
			}
			
			if (num == 1) {
				String str = br.readLine();

				if (str == null) {
					break;
				}
				String[] sArray = str.split(",");

				name = sArray[0];
				hp = sArray[1];
				company = sArray[2];

				pList.add(new Person(name, hp, company));
				System.out.println(pList.size() + ".  " + name + "   " + hp + "  " + company);
			} 
			
			else if (num == 2) {
				System.out.print("이름 :");
				name = sc.next();
				System.out.print("휴대전화 :");
				hp = sc.next();
				System.out.print("회사전화 :");
				company = sc.next();
				System.out.println("[등록되었습니다.]");
				pList.add(new Person(name, hp, company));	//입력값추가					
				System.out.println("1. 리스트   2. 등록    3. 삭제   4. 검색   5. 종료");
				System.out.println("---------------------------------------------------");
				System.out.print(">메뉴번호 :");
				num = sc.nextInt();
				System.out.println(pList.size() + ".  " + name + "   " + hp + "  " + company);
				
			}
		}
		
			
		/*
		switch (num) {
		case 1: 
		
		while(true) {
			String str = br.readLine();
			
			if (str == null) {
				break;
			}
			String[] sArray = str.split(",");
			
			name = sArray[0];
			hp = sArray[1];
			company = sArray[2];
			
			pList.add(new Person(name, hp, company));
			System.out.println(pList.size() + ".  " + name + "   " + hp + "  " + company);
		}
		System.out.println("1. 리스트   2. 등록    3. 삭제   4. 검색   5. 종료");
		System.out.println("---------------------------------------------------");
		System.out.print(">메뉴번호 :");
		num = sc.nextInt();
		
		
		case 2:System.out.print("이름 :");
		name = sc.next();
		System.out.print("휴대전화 :");
		hp = sc.next();
		System.out.print("회사전화 :");
		company = sc.next();
		System.out.println("[등록되었습니다.]");
		pList.add(new Person(name, hp, company));	//입력값추가					
		System.out.println("1. 리스트   2. 등록    3. 삭제   4. 검색   5. 종료");
		System.out.println("---------------------------------------------------");
		System.out.print(">메뉴번호 :");
		num = sc.nextInt();
		System.out.println(pList.size() + ".  " + name + "   " + hp + "  " + company);

		
		break;
		case 5: 
			System.out.println("*************************************");
			System.out.println("*           감사합니다.*             ");
			System.out.println("*************************************");
			break;
		}
		*/
		
		
			
				
		
		
		sc.close();
		br.close();
	}

}
