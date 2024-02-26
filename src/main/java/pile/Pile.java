package pile;




public class Pile<T> { // d�but de classe
	
	
	// attributs de classe
	private T[] tab; // tableau
	private int size; // taille actuelle du tableau (!= max)
	
	
	/**
	 * Constructeur pour la classe pile
	 */
	@SuppressWarnings("unchecked")
	public Pile() {
		this.tab = (T[]) new Object[100];
		this.size = 0;
	} // fin du constructeur
	
	/**
	 * Constructeur pour la classe pile
	 * @param max la taille maximale de la pile
	 */
	public Pile(int max) {
		this.tab = (T[]) new Object[100];
	} // fin de la fonction
	
	
	/**
	 * D�termine si la pile est vide
	 * @return si la pile est vide
	 */
	public boolean isEmpty() {
		return this.size == 0;
	} // fin de la fonction
	
	/**
	 * D�termine si la pile est pleine
	 * @return si la pile est pleine
	 */
	public boolean isFull() {
		return this.size==this.tab.length;
	} // fin de la fonction

	/**
	 * Empile un �l�ment � la pile
	 * @param element l'�l�ment � empiler
	 * @throws RuntimeException si la pile est pleine
	 */
	public void push(T element) throws RuntimeException{
		if(this.isFull()) {
			throw new RuntimeException("La pile est pleine ^^");
		}
		this.tab[this.size] = element;
		this.size++;
	} // fin de la fonction
	
	/**
	 * Depile la pile
	 * @throws RuntimeException si la pile est vide
	 */
	public void pop() throws RuntimeException {
		if(isEmpty()) {
			throw new RuntimeException("La pile est vide ^^");
		}
		this.size--;
	} // fin de la fonction
	
	/**
	 * Renvoie le sommet de la pile
	 * @return le sommet
	 * @throws RuntimeException si la pile est vide
	 */
	public T top() throws RuntimeException {
		if(isEmpty()) {
			throw new RuntimeException("La pile est vide ^^");
			
		}
		return this.tab[size-1];
	} // fin de la fonction
	
	

} // fin de classe :P
