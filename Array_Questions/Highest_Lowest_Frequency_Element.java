import java.util.HashMap;

public class Highest_Lowest_Frequency_Element {
  static int[] getHighLowFreq(int arr[]){
    HashMap<Integer,Integer> freq = new HashMap<>();
    for(int num:arr){
      freq.put(num,freq.getOrDefault(num, 0)+1);
    }
    for(int i:freq.keySet()){
      System.out.println(i + " => " + freq.get(i));
    }
    int highFreqency=Integer.MIN_VALUE;
    int highestNum=-1;
    for(int key:freq.keySet()){
      int currentKey=key;
      int currentFreqency=freq.get(key);
      if(currentFreqency>highFreqency){
        highFreqency=currentFreqency;
        highestNum=currentKey;
      }
    }
    int LowFreqency=Integer.MAX_VALUE;
    int LowestNum=-1;
    for(int key:freq.keySet()){
      int currentKey=key;
      int currentFreqency=freq.get(key);
      if(currentFreqency<LowFreqency){
        LowFreqency=currentFreqency;
        LowestNum=currentKey;
      }
    }
    int ans[]={highestNum,LowestNum};
    return ans;
    
  }
 public static void main(String[] args) {
  int arr[]={1,2,2,2,3,3,3,4,4,5,5,5,5,5};
  int ans[]=getHighLowFreq(arr);
  System.out.println("The highest frequency element ,frequency is this:"+ans[0]);
  System.out.println("The Lowest frequency element ,frequency is this:"+ans[1]);
 }
}

