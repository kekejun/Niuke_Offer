package L019;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/17
 * Time: 17:35
 */
public class Main {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int minX = 0,maxX = matrix.length-1,minY = 0,maxY = matrix[0].length-1;

        ArrayList<Integer> list = new ArrayList<>();
        while (minX <= maxX && minY <= maxY) {
            for(int i = minY ; i<= maxY ;i++ ){
                list.add(matrix[minX][i]);
            }
            minX++;
            if(minX > maxX || minY > maxY)
                break;
            for(int i = minX ;i<= maxX ;i++ ){
                list.add(matrix[i][maxY]);
            }
            maxY--;
            if(minX > maxX || minY > maxY)
                break;
            for(int i = maxY ;i>= minY ;i-- ){
                list.add(matrix[maxX][i]);
            }
            maxX--;
            if(minX > maxX || minY > maxY)
                break;
            for(int i = maxX ;i>= minX ;i-- ){
                list.add(matrix[i][minY]);
            }
            minY++;
            if(minX > maxX || minY > maxY)
                break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1},{2},{3},{4},{5}};
        ArrayList<Integer> result = new Main().printMatrix(matrix);
        System.out.println(result.size());
        for(int i = 0 ;i< result.size() ;i++ )
            System.out.println(result.get(i));
    }
}
