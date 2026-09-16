import java.util.Random;

public class Matrix {
    private int [][] data;
    public Matrix(int row, int col){
        data = new int[row][col];
    }
    public Matrix(int [][] data){
        this.data = data;
    }
    public void populateRandom(){
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                Random rand = new Random();
                data[i][j] = rand.nextInt(10) + 1;
            }
        }
    }
    public Matrix add(Matrix other) throws IllegalArgumentException{
        boolean EqualDimension = true;
        if(this.data.length != other.data.length){
            throw new IllegalArgumentException("Matrix Dimension not equivalent\n" +
                    "Dimensions of the Matrices are: " + this.data.length + ", " + this.data[0].length +
                    " and " + other.data.length + ", " + other.data[0].length);
        }
        for(int i = 0; i < other.data.length; i++){
            if(this.data[i].length != other.data[i].length){
                throw new IllegalArgumentException("Matrix Dimension not equivalent\n" +
                "Dimensions of the Matrices are: " + this.data.length + ", " + this.data[0].length +
                " and " + other.data.length + ", " + other.data[0].length);
            }
        }
        Matrix res = new Matrix(this.data);
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                res.data[i][j] = res.data[i][j] + other.data[i][j];
            }
        }
        return res;
    }
    public Matrix multiply(Matrix other) throws IllegalArgumentException{
        boolean EqualDimension = true;
        if(this.data.length != other.data.length){
            throw new IllegalArgumentException("Matrix Dimension not equivalent\n" +
                    "Dimensions of the Matrices are: " + this.data.length + ", " + this.data[0].length +
                    " and " + other.data.length + ", " + other.data[0].length);
        }
        for(int i = 0; i < other.data.length; i++){
            if(this.data[i].length != other.data[i].length){
                throw new IllegalArgumentException("Matrix Dimension not equivalent\n" +
                        "Dimensions of the Matrices are: " + this.data.length + ", " + this.data[0].length +
                        " and " + other.data.length + ", " + other.data[0].length);            }
        }
        Matrix res = new Matrix(this.data);
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                res.data[i][j] = res.data[i][j] * other.data[i][j];
            }
        }
        return res;
    }
    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < this.data.length; i++){
            for(int j = 0; j < this.data[i].length; j++){
                res = res + this.data[i][j] + " ";
            }
            res = res + "\n";
        }
        return res;
    }
}
