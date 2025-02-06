

class ResistorColorDuo {
    int value(String[] colors) {
        String resistorValue = "";
        for(int i=0; i<2; i++){
            String color = colors[i];
            switch (color){
                case "black":
                    resistorValue += "0";
                    break;
                case "brown":
                    resistorValue += "1";
                    break;
                case "red":
                    resistorValue += "2";
                    break;
                case "orange":
                    resistorValue += "3";
                    break;
                case "yellow":
                    resistorValue += "4";
                    break;
                case "green":
                    resistorValue += "5";
                    break;
                case "blue":
                    resistorValue += "6";
                    break;
                case "violet":
                    resistorValue += "7";
                    break;
                case "grey":
                    resistorValue += "8";
                    break;
                case "white":
                    resistorValue += "9";
                    break;
            }
        }
        int resistorValueNumber = Integer.parseInt(resistorValue);
        return resistorValueNumber;
    }
}
