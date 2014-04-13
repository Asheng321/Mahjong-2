package com.me.mygdxgame;

import com.me.mygdxgame.screens.GameScreen;

import com.badlogic.gdx.Game;

public class Mahjong extends Game {
	
	@Override
	public void create() {
		setScreen(new GameScreen());
	}

}
