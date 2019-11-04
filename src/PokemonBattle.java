import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String pokemon = battleStart();
			damage(pokemon);
			statsTable();
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
	public static void damage(String pokemon) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Trainer, what is your " + pokemon + "'s level?");
		int level = userInput.nextInt();
		
		
	}
	public static void statsTable() {
		
	}
}
