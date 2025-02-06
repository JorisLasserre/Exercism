import java.util.ArrayList;
import java.util.List;

class Series {
    private String series;
    Series(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("series cannot be empty");
        }
        this.series = string;
    }

    List<String> slices(int num) {

        if (num <= 0) {
            throw new IllegalArgumentException("slice length cannot be negative or zero");
        }
        if (num > series.length()) {
            throw new IllegalArgumentException("slice length cannot be greater than series length");
        }
        List<String> listString = new ArrayList<>();
        for(int i=0; i<= series.length()-num;i++){
            listString.add(series.substring(i,i+num));
        }

        return listString;
    }
}
