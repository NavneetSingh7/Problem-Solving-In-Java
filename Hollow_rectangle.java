public class Hollow_rectangle {
    public static void hollowPattern(int rowCols, int colCols){
        for(int i=1; i<=rowCols; i++){
            for(int j=1; j<=colCols; j++){
                if(i == 1 || j == 1 || i == rowCols || j == colCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowPattern(4, 5);
    }
}
