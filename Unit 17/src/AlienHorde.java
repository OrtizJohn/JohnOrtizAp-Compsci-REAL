//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int size;
	private int tick;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		this.size = size;
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	

	public void moveEmAll() {
		tick++;
		for (Alien al : aliens) {
			if (tick <= 120)
				al.move("RIGHT");
			else if (tick <= 320)
				al.move("DOWN");
			else if (tick <= 440)
				al.move("LEFT");
			else if (tick <= 640)
				al.move("UP");
			else if (tick <= 1000)
				tick = 0;
		}
	}

	public void drawEmAll(Graphics window) {
		for (Alien al : aliens)
			al.draw(window);
	}
	public void checkSize(Bullets shots, Ship ship){
		if (size <= 23 && size >= 18){
			shots.add(new Laser(ship.getX() + ship.getWidth() / 2 - 2, ship.getY(), 5));
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++)
			for (int j = 0; j < aliens.size(); j++)
				try {
					if (shots.get(i).isCollidingMT(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						size--;
					}
				} catch (Exception e) {
				}
	}
	public void checkShipDeath(Ship ship) {
		for (int i = 0; i < aliens.size(); i++)
			if (ship.isCollidingMT(aliens.get(i))) {
				System.out.println("You lose.");
				System.exit(0);
			}
	}
	public int getSize() {
		return size;
	}

	public String toString() {
		return "";
	}

}