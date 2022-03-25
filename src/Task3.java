public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        //Sir I know I used a beginner way of coding,but I tried to create the 2D array like this:
        //int [][] Matrix= new int[10][10]; and then add the values on the matrix using for loop, but it was
        // giving me an error, sorry!

        int[][] Matrix = {{9, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 8, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 7, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 6, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 5, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 4, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 3, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 2, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 9}};
        System.out.println("Matrix is bellow:   ");
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j]);
            }
            System.out.println(" ");


        }
        for (int n = 0; n < Matrix.length; n++) {
            sum += Matrix[n][n];
        }

        System.out.println("The sum of elements on the diagonal is : " + sum);


    }
}
