package com.real.mahjong;

import com.real.mahjong.screens.GameScreen;
import com.badlogic.gdx.Game;

public class Mahjong extends Game {
	
	@Override
	public void create() {
		GameScreen gs = new GameScreen();
		setScreen(gs);
		
	}

}
