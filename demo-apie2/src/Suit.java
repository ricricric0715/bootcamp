public enum Suit {
  
DIAMOND, CLUB, HEART, SPADE ; //自動排了大小, DIAMOND=1, CLUB=2...

  //private int value; 
  //private Suit(int value){
  //this.value = value;
  //}

  //private int getValue(){
  //return this.value;
  //}

  //public int CompareTo(Suit suit){
  //if (this == suit)
  //return 0;
  //if (this.getValue() > suit.getValue())
  //return -1;
  //return 1;
  //}


  public static void main(String[] args) { 
    //enum 
  System.out.println(Suit.HEART.compareTo(Suit.DIAMOND));
    


  }
}
