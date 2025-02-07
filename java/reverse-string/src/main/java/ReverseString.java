class ReverseString {

    String reverse(String inputString) {
        String reverseString = "";

        for(int i =inputString.length(); i>0;i-- ){
            reverseString += inputString.toCharArray()[i-1];
        }
        return reverseString;
    }
  
}
