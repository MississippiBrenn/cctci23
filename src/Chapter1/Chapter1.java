package Chapter1;

public class Chapter1 {
    //1.1
    public boolean isUnique(String str){
    // can include any letter, number or special character
        if(str.isEmpty()) return true;
        if(str.length()>128) return false;

        // no additional data structure nested loop Time On2 Space Ox
//        for(int i = 0; i < str.length()-1; i++){
//            char curr = str.charAt(i);
//            System.out.println(i);
//            for(int j = i+1; j < str.length(); j++){
//                char checking = str.charAt(j);
//                System.out.println(j);
//                if(curr == checking ){
//                    return false;
//                }
//            }
//        }

        //additional data structure assign to set and compare lengths
        boolean[] chars = new boolean[128];

        for(char c: str.toCharArray()){
            int charIndex = c;
            if(chars[charIndex]) return false;
            chars[charIndex] = true;
        }

        return true;
    }

    public String sort(String str1){
        char[] char_set = str1.toCharArray();

        java.util.Arrays.sort(char_set);
        return new String(char_set);
    }
    public boolean isPermutation(String str1, String str2){
        return str1.length() == str2.length() ? sort(str1).equals(sort(str2)): false;

//        if(str1.equals(str2)) return true;
//        if(str1.length() != str2.length()) return false;
//
//        Set<Character> set = new HashSet<>();
//
//        for(int i = 0; i < str1.length(); i++){
//            set.add(str1.charAt(i));
//        }
//
//        for(int j = 0; j< str2.length(); j++) {
//            if (!set.contains(str2.charAt(j))) {
//                return false;
//            }
//        }
//        return true;


    }


    public String URLify(String str1) {

        String[] arrOfStr = str1.split(" ", 0);
        String joinedString = String.join("%20", arrOfStr);
        return joinedString;

    }

    public boolean palindromePermutation (String str1){
        char[] charArray = str1.toCharArray();

        for(int i = 0; i < charArray.length/2; i++){
            if(charArray[i] != charArray[charArray.length-(i+1)]){
                return false;
            }
        }
        return true;
    }

    public boolean editsAway(String str1, String str2){
        if(Math.abs(str1.length()-str2.length()) > 1) return false;

        int editsAway = 0;
        int shortPointer = 0;
        int longPointer = 0;

        String shorterString = str1.length()>str2.length() ? str2 : str1;
        String longerString = str1.length()>str2.length() ? str1 : str2;

        while(shortPointer < shorterString.length()){
            if(shorterString.charAt(shortPointer) == longerString.charAt(longPointer)){
                shortPointer++;
                longPointer++;
            } else if (shorterString.charAt(shortPointer) != longerString.charAt(longPointer)) {
                longPointer++;
                editsAway++;
                System.out.println(editsAway);
                if(editsAway > 1){
                    return false;
                }
            }
        }
        return true;
    }

    public String stringCompression(String str1){
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            count ++;
            if(i+1 >= str1.length() || str1.charAt(i) != str1.charAt(i+1)){
                compressed.append(str1.charAt(i));
                compressed.append(count);
                count = 0;
            }

        }

        String finalString = compressed.toString().length() > str1.length()? compressed.toString() : str1;

        return finalString;

    }

}



