//
import java.util.Comparator;

public class SortedByIntegerDesc implements Comparator<Integer>{
// if we return -1, means i1 goes first  
  @Override
public int compare(Integer i1, Integer i2){
  if(i1 > i2)
  return -1;
  else  
  return 1;
 


 }
}
