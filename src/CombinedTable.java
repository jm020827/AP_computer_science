public class CombinedTable {

    private SingleTable t1;
    private SingleTable t2;

    int seat1;
    int seat2 ;
    int seat;

    int height1;
    int height2;

    public CombinedTable(SingleTable t1, SingleTable t2){
        this.t1 = t1;
        this.t2 = t2;
        seat1 = t1.getNumSeats();
        seat2 = t2.getNumSeats();
        seat = seat1+seat2-2;

        height1 = t1.getHeight();
        height2 = t2.getHeight();
    }

    public boolean canSeat(int num){
        if(num<=seat){
            return true;
        }
        else{
            return false;
        }
    }

    public double getDesirability(){
        if(height1==height2){
            return (t1.getViewQuality()+t2.getViewQuality())/2;
        }
        else{
            return (t1.getViewQuality()+t2.getViewQuality())/2-10;
        }
    }

    public static void main(String[] args) {

        SingleTable t1 = new SingleTable(4,74,60);
        SingleTable t2 = new SingleTable(8,74,70);
        SingleTable t3 = new SingleTable(12,76,75);

        CombinedTable c1 = new CombinedTable(t1,t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(t2,t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());
        t2.setViewQuality(80);
        System.out.println(c2.getDesirability());
    }
}
