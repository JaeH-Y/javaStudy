package sec06.exam06;

import java.util.ArrayList;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		
		
		c.SetSpeed(-50);
		System.out.println("현재 속도: " + c.GetSpeed());
		c.SetSpeed(60);
		System.out.println("현재 속도: " + c.GetSpeed());
		
		if(!c.GetStop()) {
			c.SetStop(true);
		}
		System.out.println("현재 속도: " + c.GetSpeed());
		
		
		
	}
}
