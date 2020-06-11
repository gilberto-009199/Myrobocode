package fnl;

import robocode.ScannedRobotEvent;

import java.awt.Color;

import robocode.HitRobotEvent;
import robocode.Robot;

public class FnlBot extends Robot {
	
	
	
	
	public void run() {
		
		setBodyColor(Color.yellow);
		setGunColor(Color.black);
		setRadarColor(Color.black);

		turnLeft(getHeading() % 90);
		turnGunRight(90);
		while(true) {
			
			turnGunRight(64);
			ahead(512);
			turnRight(32);
			turnGunRight(16);
		}
	}
	public void onScannedRobot(ScannedRobotEvent event) {
		
		fire(2);
		
	}
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
	
}
