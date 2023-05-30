package Chapter1;

public class Chapter1 {
    //1.1
    public boolean isUnique(String str){
    // can include any letter, number or special character
        if(str.isEmpty()) return true;
        if(str.length()>128) return false;

        // no additional data structure nested loop Time On2 Space Ox
        for(int i = 0; i < str.length()-1; i++){
            char curr = str.charAt(i);
            System.out.println(i);
            for(int j = i+1; j < str.length(); j++){
                char checking = str.charAt(j);
                System.out.println(j);
                if(curr == checking ){
                    return false;
                }
            }
        }

        //additional data structure assign to set and compare lengths
        return true;
    }
}


