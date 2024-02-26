import pile.Pile;

import java.util.logging.Logger;

public class ClasseEssaiPile {
	 
	private static final Logger log = Logger.getLogger(ClasseEssaiPile.class.getName());

	/**
	 * Runs a series of tests on a Stack
	 */
	public static void main(String[] args) {
		// Pile r�-utilisable (supporte plusieurs types) 
		Pile<Integer> maPile = new Pile<>();
		
		if(maPile.isEmpty()) {
			log.info("La pile est vide");
		}
		maPile.push(5);
		
		if(!maPile.isEmpty()) {
			log.info("La pile n'est plus vide");
		}
		
	
		log.info("Sommet de la pile " + maPile.top());
		
		maPile.pop();
		
		if(maPile.isEmpty()) {
			log.info("La pile est vide");
		}
		
		maPile.push(10);
		maPile.push(20);
		maPile.push(30);
		
		log.info("Nouveau sommet " + maPile.top());
		
		
		
				
		
		
		
		
		
	}

}
