import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			battleStart();
			damage();
			statsTable();
	}
	public static void battleStart() {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Which Pokémon do you choose?");
		String pokemon = userInput.nextLine();
		System.out.println("You chose " + pokemon);
		System.out.println("They chose Zebstrika.");

	}
	public static void damage() {
		
	}
	public static void statsTable() {
		
	}
}
