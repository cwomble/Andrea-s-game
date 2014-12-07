package com.charleswomble.GameState;

import java.awt.Color;
import java.awt.Graphics2D;
import com.charleswomble.TileMap.TileMap;
import com.charleswomle.Andreasgame.GamePanel;

public class Level1State extends GameState
{
	
	private TileMap tileMap;

	public Level1State(GameStateManager gsm)
	{
		this.gsm = gsm;
	}
	
	@Override
	public void init() 
	{
		tileMap = new TileMap(30);
		tileMap.loadTiles("/Tilesets/grasstileset.gif");
		tileMap.loadMap("/Maps/level1-1.map");
		tileMap.setPosition(0, 0);
		
	}

	@Override
	public void update() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) 
	{
		//clear screen
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		
		//draw tilemap
		tileMap.draw(g);
		
	}

	@Override
	public void keyPressed(int k) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int k) 
	{
		// TODO Auto-generated method stub
		
	}

}
