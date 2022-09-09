public class SingleTable{

    private int seat;
    private int height;
    private double view;

    public SingleTable(int seat, int height, int view){
        this.seat = seat;
        this.height = height;
        this.view = view;
    }


    public int getNumSeats(){
        return this.seat;
    }

    public int getHeight(){
        return this.height;
    }

    public double getViewQuality(){
        return this.view;
    }

    public void setViewQuality(double value){
        this.view = value;
    }
}


