import java.util.HashMap;
public class Q20_Find_First_Repeating_Element {
  static void repeatingElement(int arr[]){
    HashMap<Integer,Integer> freq= new HashMap<>();
     for(int n : arr){
      freq.put(n,freq.getOrDefault(n, 0)+1);
     }
     for(int key : freq.keySet()){
       if(freq.get(key)>1){
        System.out.println(key);
       }
     }
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,4,5};
    repeatingElement(arr);
  }
}
