package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Player;
import com.bean.Team;


public class TeamBO {
	public Team createTeam(String data, Player[] PlayerList) {
		Team team = new Team();
		String[] datas = data.split(",");
		team.setName(datas[0]);
		for(Player player: PlayerList) {
			if(player.getName().equals(datas[1])) {
				
				team.setPlayer(player);
				//return team;
			}
		}
		return team;
		
	}
}
