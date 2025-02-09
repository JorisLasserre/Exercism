class RaindropConverter {

    String convert(int number) {
        String message = "";

        if(!(number % 3 == 0) && !(number % 5 == 0) && !(number % 7 == 0)){
            message += number;
        }else{
            if(number % 3 == 0){
                message += "Pling";
            }
            if(number % 5 == 0){
                message += "Plang";
            }
            if(number % 7 == 0){
                message += "Plong";
            }
        }
        return message;
    }

}
