package lab9;

import lab9.implementations.ConsolePrintingHistoryReceiver;
import lab9.implementations.HonestFeedback;
import lab9.providers.ProvidesFeedback;
import lab9.providers.ProvidesGuess;

public class Controller {
	
	private final GameProperties game;
	private final ProvidesGuess codeMaker, codeBreaker;
	private final String name;
	
	public Controller(GameProperties g, ProvidesGuess codeMaker, ProvidesGuess codeBreaker) {
		this.name        = g.getName();
		this.game        = g;
		this.codeMaker   = codeMaker;
		this.codeBreaker = codeBreaker;
	}
	
	public void run() {
		History hist = new History(game);
		ConsolePrintingHistoryReceiver console = new ConsolePrintingHistoryReceiver(game.getName());
		console.message(" ");
		console.message("Game starts");
		hist.addObserver(console);
		boolean won = false;
		boolean okMove = true;
		do {
			Guess code  = codeMaker.getGuess();
			Guess guess = codeBreaker.getGuess();
			
			ProvidesFeedback pf = new HonestFeedback(code);
			if (pf.isSolution(guess)) {
				console.message("Winner!");
				won = true;
			}
			okMove = hist.registerGuess(guess);

//			console.output(code);
//			console.message(" number exactly right position " + pf.numSamePosition(guess));
//			console.message(" number of pegs in common color " + pf.numIntersection(guess));

//			above were in the video, but this will put the information out on one line:

			console.output(code, pf.numSamePosition(guess), pf.numIntersection(guess));
			if (!okMove)
				console.message("Bad move, you lose!");
		} while (okMove && !won);
		console.message("Game ends");
		console.message(" ");

	}
	
}
