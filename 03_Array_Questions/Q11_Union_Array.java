import java.util.HashSet;

public class Q11_Union_Array {
  static void union(int arr1[],int arr2[]){
  HashSet<Integer> set =new HashSet<>();
  for(int num:arr1){
    set.add(num);
  }
  for(int num:arr2){
    set.add(num);
  }
  System.out.println(set);
}
public static void main(String[] args) {
  int arr1[]={1,2,3,4,5,6,12};
  int arr2[]={10,20,3,4,5,12,14,90};
  union(arr1, arr2);
}
}

