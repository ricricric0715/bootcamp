import java.util.Objects;

public class Card {
  private char rank;
  private char suit;

  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public char getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  // ! Override false -> true
  @Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2: check if Card object
    if (!(obj instanceof Card))
      return false;
    // Part 3: rank && suit
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  @Override
  public String toString() {
    return "Card(" 
      + "rank=" + this.rank
      + ",suit=" + this.suit
      + ")";
  }

  // ACE Diamond vs King Diamond -> 1
  // King Diamond vs ACE Diamond -> -1
  public Card compareTo(Card card) {
    // rank
    // Spade > Heart > Club -> Diamond
  }
}

// compareTo 大 = 1, 小 = -1, 一樣 = 0
