import java.util.*;
class zigzagPrint {
    
    public static void printZigzag(int[][] matrix){
        for(int row=0;row<matrix.length;row++){
            if(row%2==0){
                for(int col=0;col<matrix[0].length;col++){
                    System.out.print(matrix[row][col]+" ");
                }
            }else{
                for(int col=matrix[0].length-1;col>=0;col--){
                    System.out.print(matrix[row][col]+" ");
            }
         }
           System.out.println();
    }
}
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    printZigzag(matrix);
    }


}