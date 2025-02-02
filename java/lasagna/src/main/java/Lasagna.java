public class Lasagna {
    int minutes;
    final int LAYERTIME = 2;
    public int expectedMinutesInOven(){
        return minutes = 40;
    }

    public int remainingMinutesInOven(int a){
        return expectedMinutesInOven() - a;
    }

    public int preparationTimeInMinutes(int layer){
        return LAYERTIME*layer;
    }

    public int totalTimeInMinutes(int numberLayer, int numberMinutes){
        return preparationTimeInMinutes(numberLayer) +numberMinutes;
    }
}
