public class Q12_Long_Pressed_Name {
   public static boolean longPressedName(String name,String typed){
     int i =0;
     int j =0;

        while(j<typed.length()){
            if( i >= 0 && name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else{
                if(j >= 0 && typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                }else{
                    return false;
                }
            }
        }
    return true;
    }
}

