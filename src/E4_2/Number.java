package E4_2;

public class Number {

    public int number;

    public Number(int number) {
        this.number = number;
    }
    public double getSquare() {
        return  Math.pow(number,2);
    }
    public double getcube() {
        return Math.pow(number,3);
    }
    public double getFourth(){
        return Math.pow(number,4);
    }
}
