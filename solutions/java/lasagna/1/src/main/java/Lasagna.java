public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int number){
        return expectedMinutesInOven()-number;
    }
    public int preparationTimeInMinutes(int layer){
        return 2*layer;
    }
    public int totalTimeInMinutes(int layer,int time){
        return preparationTimeInMinutes(layer)+time;
    }
}
