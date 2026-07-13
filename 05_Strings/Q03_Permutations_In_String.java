public class Q03_Permutations_In_String {
  static public boolean compareFreq(int count1[],int count2[]){
        for(int i =0;i<26;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
  static public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length()){
            return false;
        }
        int count1[]=new int[26];
        for(int i =0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int index=ch-'a';
            count1[index]++;
        }
        int i = 0;
        int count2[]=new int[26];
        int windowLength=s1.length();
        for(i=0;i<windowLength;i++){
            char ch=s2.charAt(i);
            int index=ch-'a';
            count2[index]++;
        }
        if(compareFreq(count1,count2)==true){
            return true;
        }else{
            while(i<s2.length()){
              char newChar=s2.charAt(i);
              int index=newChar-'a';
              count2[index]++;

              int oldChar=i-windowLength;
              char ch = s2.charAt(oldChar);
              int oldCharIndex=ch-'a';
              count2[oldCharIndex]--;

              if(compareFreq(count1,count2)==true)
                return true;
            i++;
        }
    }
    return false;
   }
   public static void main(String[] args) {
    String s1="ab";
    String s2="eidbaooo";
    boolean ans=checkInclusion(s1, s2);
    System.out.println(ans);
   }
}

