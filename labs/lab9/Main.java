package lab9;

import lab9.implementations.RandomColorProvider;
import lab9.implementations.RandomGuessProvider;
import lab9.implementations.StaticGuessProvider;
import lab9.providers.ProvidesColor;
import lab9.providers.ProvidesGuess;
import lab9.viz.ColorChooser;

public class Main {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		//
		// Always wins
		//
		GameProperties alwaysWins = new GameProperties("Always wins");

		ProvidesGuess same = new StaticGuessProvider(alwaysWins);
		new Controller(alwaysWins, same, same).run();
		
		//
		// likely not to win, but should stop on the first repeated guess
		//
		GameProperties repeats = new GameProperties("Always same guess");
		ProvidesGuess likelyDifferent = new StaticGuessProvider(repeats);
		new Controller(repeats, same, likelyDifferent).run();
		
		//
		// Random guessing version, likely not to win
		//
		GameProperties random = new GameProperties("Random guesser");
		new Controller(random, new StaticGuessProvider(random), new RandomGuessProvider(random)).run();
				
		
		//
		// Interactive version
		//
		
		GameProperties interactive = new GameProperties("Interactive");
		ProvidesColor pc      = new RandomColorProvider(interactive);
		ProvidesGuess breaker = ColorChooser.launchChooser(interactive, pc);
		Controller c = new Controller(interactive, new StaticGuessProvider(interactive), breaker);
		c.run();

	}

}
