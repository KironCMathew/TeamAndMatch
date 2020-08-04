package com.service;

import com.bean.Player;
import com.user.*;


public class PlayerBO {
	HomePage home = new HomePage();
	public Player createPlayer (String data) {
		Player player = new Player();
		String[] datas = data.split(",");
		player.setName(datas[0]);
		player.setCountry(datas[1]);
		player.setSkill(datas[2]);
		return player;
	}

}
