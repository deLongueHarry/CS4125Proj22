public class Tier {

private String T1;
private String T2;
private String T3;

public String setTier(int i){

    T1= "Gold";
    T2= "Silver";
    T3= "Bronze";

    if( i == 1 ){
      return T1;


    }
    
    else if(i ==2 ){
     return T2;
    }

    else if(i==3){

        return T3;
    }
// throw /catch
    else {

        return null;
    }
 

}

public void setTierName(String name) {
}


}