import java.util.HashMap;

public class Q10_Mode_Of_Array {
  static int getMode(int arr[]){
    HashMap<Integer,Integer> freq = new HashMap<>();
    for(int num:arr){
      freq.put(num,freq.getOrDefault(num, 0)+1);
    }
    for(int i:freq.keySet()){
      System.out.println(i + " => " + freq.get(i));
    }
    int maxFreqency=-1;
    int maxFreqencyWaliKey=-1;
    for(int key:freq.keySet()){
      int currentKey=key;
      int currentkeyKiFreqency=freq.get(key);
      if(currentkeyKiFreqency>maxFreqency){
        maxFreqency=currentkeyKiFreqency;
        maxFreqencyWaliKey=currentKey;
      }
    }
    return maxFreqencyWaliKey;
  }
 public static void main(String[] args) {
  int arr[]={1,2,2,2,3,3,3,4,4,5,5,5,5,5};
  int ans=getMode(arr);
  System.out.println("The highest frequency element ,frequency is this:"+ans);
 }
}
