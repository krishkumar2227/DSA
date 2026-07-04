public class Q12_Roti_Paratha_SPOJ {
  static boolean isValidAns(int cooks[],int timelimit,int totalParatha,int totalcooks){
    int parathaCount=0;
    for(int i =0;i<cooks.length;i++){
      int currentCookRank=cooks[i];
      int timetaken=0;
      int j=1;
      while(timetaken<=timelimit){
        if(timetaken+j*currentCookRank<=timelimit){
          timetaken=timetaken+j*currentCookRank;
          parathaCount++;
          j++;
        }else{
          break;
        }
      }
      if(parathaCount>=totalParatha){
        return true;
      }
    }
    if(parathaCount>=totalParatha){
        return true;
    }else{
      return false;
  }
}
static int rotiparatha(int cooks[],int n,int p){
  int m=cooks.length;
  int s=0;
  int maxRank=-1;
  for(int i =0;i<m;i++){
    if(cooks[i]>maxRank){
      maxRank=cooks[i];
    }
  }
  int e=maxRank*(n*(n+1)/2);
  int ans=-1;
  while(s<=e){
    int timelimit=s+(e-s)/2;
    if((isValidAns(cooks,timelimit,p,n))){
       ans=timelimit;
       e=timelimit-1;
    }else{
      s=timelimit+1;
    }
  }
  return ans;
}
public static void main(String[] args) {
  int cooks[]={1,2,3,4};
  int p=10;
  int n=4;
  int ans=rotiparatha(cooks, n, p);
  System.out.println(ans);
}
}
