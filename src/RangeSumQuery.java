/**
 * Created by Omer on 11/29/2016.
 */
public class RangeSumQuery {

    int[] data;
    int width;
    int heigth;
    int[][] matrix;

    public RangeSumQuery(int[][] matrix) {
        this.matrix = matrix;
        width = matrix[0].length;
        heigth = matrix.length;
        data = new int[width * heigth];
        for(int i = 0; i < heigth; i++){
            for(int j = 0; j < width; j++){
                if(i==0 && j==0){
                    data[0]=matrix[0][0];
                }else if(i==0){
                    data[i * width + j] += matrix[i][j] + data[i * width + j -1];
                }else if(j==0){
                    data[i * width + j] += matrix[i][j] + data[(i-1) * width + j];
                }else{
                    data[i * width + j] += matrix[i][j] - data[(i-1) * width + j -1] + data[(i-1) * width + j] + data[i * width + j -1];
                }
                System.out.print(data[i * width + j]+"|");
            }
            System.out.println();
        }
    }

    public void update(int row, int col, int val) {
        int index = (col) + (row-1) * width;
        int sum = val - matrix[row-1][col-1];
        System.out.println("sum:"+sum);
        for(int i = 0;i<heigth;i++){
            for (int j = 0; j<width;j++){
                if(i>=row-1 && j>=col-1){
                    data[i * width + j] +=sum;
                }
            }
        }
        for(int i = 0; i < heigth; i++){
            for(int j = 0; j < width; j++){
                System.out.print(data[i * width + j]+"|");
            }
            System.out.println();
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int r1 = row1;
        int r2 = row2;
        int c1 = col1;
        int c2 = col2;
        int  tl = data[r1 * width + c1];
        int  tr = data[r1 * width + c2];
        int  bl = data[r2 * width + c1];
        int  br = data[r2 * width + c2];
        System.out.println(tl + " - " + tr + " - " + bl + " - " + br);
        return data[r2 * width + c2] - data[r1 * width + c2] - data[r2 * width + c1] + data[r1 * width + c1];
    }
}
