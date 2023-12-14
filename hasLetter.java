public static int hasLetter (String word, char letter) { 
     for (int i = 0;  i < word.length(); i++){
        if (word.charAt(i).isLetter()){
            return i;
        }else{
            return -1;
        }}}
  



