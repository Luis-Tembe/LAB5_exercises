public class Task3 {
    public static void main(String[] args) {
        int n=10,i,j, sum=0;
        int Matrix[][]= new int[n][n];

        for(i=0;i<Matrix.length;i++){
            for(j=0;j<Matrix.length;j++){
                if(i==j){
                    Matrix[i][j]=i;
                    sum +=Matrix[i][j];
                }else {
                    Matrix[i][j]=0;
                }
                System.out.println(Matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The sum of the diagonal elements is equal to: "+sum);
    }
}
