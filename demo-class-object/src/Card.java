public class Card {
  
  private char rank ; // 1,2,3,4,5,6,7,8,9,T,J, Q, K  
  private char suit; // D, C, H, S  

  public Card (char rank, char suit){
    this.rank = rank;
    this.suit = suit;
  }

  public char getRank(){
    return this.rank;
  }

  public char getSuit(){
    return this.suit;
  }
  
  // !Rewrite ths definition of Card 
  // !Some of the 'false' become true  
  public boolean equals(Card card){
    return this.rank == card.getRank() && this.suit == card.getSuit();
    }


  public static void main(String[] args) {
  // ACE Spade 
    Card c1 = new Card('1', 'S');
  // 5 Diamond 
    Card c2 = new Card ('5','D');

  System.out.println(c1.equals(c2));

  Card c3 = new Card('A','S');
  System.out.println(c1.equals(c3));

  }
}
