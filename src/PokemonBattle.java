import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String pokemon = battleStart();
			int hP = damage(pokemon);
			statsTable(pokemon, hP);
	}
	public static String battleStart() {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Which Pokémon do you choose?");
		String pokemon = userInput.nextLine();
		System.out.println("You chose " + pokemon);
		System.out.println("They chose Zebstrika.");
		System.out.println(pokemon + ", Go!");
		return pokemon;
	}
	private static int damage(String pokemon) {
		Scanner userInput = new Scanner (System.in);
		System.out.print("Trainer, what is your " + pokemon + "'s level?");
		int level = userInput.nextInt();
		System.out.print("Trainer, what is your " + pokemon + "'s attack?");
		int attack = userInput.nextInt();
		System.out.print("Trainer, what is your " + pokemon + "'s defense?");
		int defence = userInput.nextInt();
		System.out.print("Trainer, what is your " + pokemon + "'s HP?");
		int hP = userInput.nextInt();
		int damage = calc(level, attack, defence);
		int dmgHP = hP - damage;
		System.out.print("Your " + pokemon + " sustained " + damage + " points of damage. It now has " + dmgHP + " HP.");
		return hP;
	}
	public static void statsTable(String pokemon, int hP) {
		System.out.println("Pokémon: " + pokemon);
		System.out.println("Level: 40");
		System.out.println("-----------------------");
		System.out.println("HP: " + hP);
		System.out.println("Attack: 52");
		System.out.println("Defence: 51");
		System.out.println("Sp. Attack: 121");
		System.out.println("Sp. Defence: 81");
		System.out.println("Speed: 107");
	}
	public static int calc (int level, int attack, int defence) {
		int damage = (((2 * level + 10)/250) + (attack / defence) * 2 + 2);
		return damage;
	}
}

