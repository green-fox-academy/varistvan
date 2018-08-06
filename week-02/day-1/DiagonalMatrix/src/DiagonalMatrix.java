// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrixArray = new int[4][4];
                for (int i=0; i<4; i++) {
                    for (int j=0; j<4; j++){
                        if(i==j){
                            matrixArray[i][j] = 1;
                        }else{
                            matrixArray[i][j] = 0;
                        }
                    }
                }
        for (int k=0; k<4; k++) {
            for (int l=0; l<4; l++){
                System.out.print(matrixArray[k][l]);
            }
            System.out.println();
        }
    }
}
