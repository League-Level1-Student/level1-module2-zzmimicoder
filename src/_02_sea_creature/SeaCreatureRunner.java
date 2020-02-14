package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		spongebob.eat();
		patrick.eat();
		squidward.eat();
		spongebob.laugh();
		patrick.laugh();
		squidward.laugh();
		System.out.println(patrick.getName());
		System.out.println(squidward.getName());
	}
}
