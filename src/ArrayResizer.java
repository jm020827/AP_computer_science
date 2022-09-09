public class ArrayResizer {

    //int[][] array2D;

    public static boolean isNonZeroRow(int[][] array2D, int r){
        for(int col=0;col<array2D[r].length;col++){
            if(array2D[r][col]==0) {
                return false;
            }
      }
      return true;
    }

    public static int isNonZeroRows(int[][] array2D){
        int n=0;
        int num=0;
        for(int row=0;row< array2D.length;row++){
            for(int col=0;col<array2D[row].length;col++){
                if(array2D[row][col]==0) {
                    n++;
                }
            }
            if(n>0){
                num++;
            }
            n=0;
        }
        return num;
    }

    public static int[][] resize(int[][] array2D){
        int[][] newArray2D = new int[isNonZeroRows(array2D)][array2D[0].length];
        int n=0;
        for(int i=0;i<array2D.length;i++){
            if(isNonZeroRow(array2D,i)){
                newArray2D[n]=array2D[i];
                n++;
            }
        }
        return newArray2D;
    }


    public static void main(String[] args) {

        int[][] arr = {{2,1,0},
                        {1,3,2},
                        {0,0,0},
                        {4,5,6}};

        System.out.println(ArrayResizer.isNonZeroRow(arr,0));
        System.out.println(ArrayResizer.isNonZeroRow(arr,1));
        System.out.println(ArrayResizer.isNonZeroRow(arr,2));
        System.out.println(ArrayResizer.isNonZeroRow(arr,3));
        System.out.println(ArrayResizer.isNonZeroRows(arr));
        int[][] newArr = ArrayResizer.resize(arr);
        for(int i=0;i<newArr.length;i++){
            for(int j=0;j<newArr[i].length;j++){
                System.out.println(newArr[i][j]);
            }
        }

    }
}
