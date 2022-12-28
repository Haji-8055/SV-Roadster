package com.xworkz.dtos.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dtos.dto.GameDTO;

public class GameRunner {
	

	public static void main(String[] args) {
		GameDTO game1=new GameDTO("ludo", "indoor", 4);
		GameDTO game2=new GameDTO("chess", "indoor", 2);
		GameDTO game3=new GameDTO("carrom", "indoor", 4);
		GameDTO game4=new GameDTO("cards", "indoor", 6);
		GameDTO game5=new GameDTO("ludo", "indoor", 4);
		GameDTO game6=new GameDTO("tabletennis", "indoor", 2);

		
		Collection<GameDTO> collect=new ArrayList<GameDTO>();
		collect.add(game5);
		collect.add(game4);
		collect.add(game2);
		collect.add(game1);
		collect.add(game3);
		
		System.out.println(collect.contains(game6));

	}

}
