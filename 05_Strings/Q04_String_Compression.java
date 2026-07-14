public class Q04_String_Compression {
  static public int strCompression(char[] chars ){
    int readIndex=0;
    int writeIndex=0;
    while(readIndex < chars.length){
         char currentChar=chars[readIndex];
         int count=0;
         while(readIndex<chars.length && currentChar==chars[readIndex]){
           readIndex++;
           count++;
      }
      chars[writeIndex]=currentChar;
      writeIndex++;
      if(count>1){
        String countStr=String.valueOf(count);
        for(char digit:countStr.toCharArray()){
          chars[writeIndex]=digit;
          writeIndex++;
        }
      }
    }
    return writeIndex;
  }
  public static void main(String[] args) {
    char chars[]={'a','b','b','b'};
    int ans=strCompression(chars);
    System.out.println(ans);
  }
}
