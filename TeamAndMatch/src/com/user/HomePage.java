package com.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.bean.Match;
import com.bean.Player;
import com.bean.Team;
import com.service.*;

public class HomePage {

	public static void main(String[] args) {
		PlayerBO player = new PlayerBO();
		TeamBO team = new TeamBO();
		MatchBO match = new MatchBO();
		
		Player[] playerList = new Player[10];
		Team[] teamList = new Team[10];
		Match[] matchList = new Match[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter player count:");
		int num = sc.nextInt();
		for(int i=1,k=0;i<=num;i++,k++) {
			//int k = 1;
			System.out.println("Enter player "+ i + " details");
			String details = sc.next();
			//player.createPlayer(details);
			playerList[k] = player.createPlayer(details);
			
		}
		
		
		
		System.out.println("Enter team count:");
		int num1 = sc.nextInt();
		for(int i=1,k=0;i<=num1;i++,k++) {
			System.out.println("Enter team "+ i + " details");
			String details = sc.next();
			teamList[k] = team.createTeam(details, playerList);
		}
		
		System.out.println("Enter match count:");
		int num2 = sc.nextInt();
		for(int i=1,k=0;i<=num2;i++,k++) {
			System.out.println("Enter match "+ i + " details");
			String details = sc.next();
			matchList[k] = match.createMatch(details, teamList);
		}
		while(true) {
		System.out.println("Menu:");
		System.out.println("1) Find Team");
		System.out.println("2) Find all matches in a specific venues");
		System.out.println("Type 1 or 2");
		System.out.println("Enter your choice");
		int num3 = sc.nextInt();
		switch(num3) {
		case 1:
			System.out.println("Enter Match Date");
			String date = sc.next();
			match.findTeam(date, matchList);
			break;
		case 2:
			System.out.println("Enter team name:");
			break;
			
		default:
			System.out.println("Do you want to continue? Y/N");
			String choice = sc.next();
			if(choice.equals("Y")) {
				continue;
			}
			else {
				System.out.println("Exit");
				break;
			}
		}
	}
  }
}
