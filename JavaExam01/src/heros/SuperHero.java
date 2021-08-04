package heros;

public class SuperHero extends Hero{
	
	public void fly() {
		System.out.println("비행");
	}
	
	public void land() {
		System.out.println("착지");
	}
	
	@Override
	public void run() {
		System.out.println("슈퍼히어로가 도망!");
	}
	
	

}
