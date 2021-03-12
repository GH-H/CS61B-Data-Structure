package sparseArray;

public class SparseArray {
    public static void main(String[] args) {
        //五子棋游戏
        //创建11*11的二维数组
        //0：无棋子 1：黑子 2：蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;

        //输出棋盘
        System.out.println("棋盘");
        for(int[] row : chessArr1){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //遍历数组得到有效值个数
        int sum = 0;
        for(int i = 0;i < 11;i++){
            for(int j = 0;j < 11;j++){
                if(chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }

        //创建稀数数组
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        //存入数据
        int count = 0;
        for(int i = 0;i < 11;i++){
            for(int j = 0;j < 11;j++){
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }

        System.out.println("稀疏数组");
        for(int i = 0;i<sparseArr.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        //恢复

        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

        for(int i =1;i<sparseArr.length;i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        //打印出来
        System.out.println("棋盘");
        for(int[] row : chessArr1){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
