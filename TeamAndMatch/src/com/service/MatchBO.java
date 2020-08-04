package com.service;

import com.bean.Match;
import com.bean.Player;
import com.bean.Team;

public class MatchBO {
	Match match = new Match();
	public Match createMatch(String data, Team[] teamList) {
		//Match match = new Match();
		String[] datas = data.split(",");
		match.setDate(datas[0]);
		for(Team team: teamList) {
			if(team.getName().equals(datas[1])) {
				
				match.setTeamone(team);
			}
		}
		
		for(Team team: teamList) {
			if(team.getName().equals(datas[2])) {
				
				match.setTeamtwo(team);
			}
		}
		
		match.setVenue(datas[3]);
		return match;
	}
	
	public Team findTeam(String matchDate, Match[] matchList) {
		for(Match match: matchList) {
			if(match.getDate().equals(matchDate)) {
			 System.out.println(match.getTeamone());
			 System.out.println(match.getTeamtwo());
			}
		}
		return null;
	
		
	}
	
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(Match match: matchList) {
			if(match.getTeam().equals(teamName)) {
				System.out.println(match.getTeam());
				continue;
			}
		}
	}
	
}
