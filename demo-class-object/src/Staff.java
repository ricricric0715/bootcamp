public class Staff {
  private long id ; // Staff作者有責任描術清楚 

  // Constructor 
  public Staff(long id){
  this.id = id;
  }

  public long getID(){
    return this.id;
  }

  public boolean equals(Staff staff){
    if(this.id == staff.getID()){
      return true; 
    }
    return false;
  } 


  public static void main(String[] args) {
    
    Staff s1 = new Staff(1L);

    // asking if the staff id = 1
 if(s1.getID() == 1L){
 }

 System.out.println(s1.equals(new Staff(1L)));

  }
}
