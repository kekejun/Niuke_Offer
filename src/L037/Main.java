package L037;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/21
 * Time: 20:22
 */
public class Main {
    public int flag = 0;
    public int GetNumberOfK(int [] array , int k) {
        if(array.length == 1 && array[0] == k)
            return 1;

        int result = getCount(array,k,0,array.length-1,0);
        return flag == 1?result:0;
    }

    public int getCount(int[] array,int k,int begin, int end ,int type) {
        System.out.println(begin+"   "+end+" "+type);
        if(begin >= end)
            return type == 0 ? begin:end;

        int middle = (begin+end)/2;
        if(k < array[middle]) {
            return getCount(array,k,begin,middle-1,type);
        } else if(k > array[middle]) {
            return getCount(array,k,middle+1,end,type);
        } else {
            if(flag == 0) {
                flag = 1;
                int m = (middle-1>0&& array[middle-1]<k) ? middle:getCount(array,k,begin,middle-1,0);
                int n = (middle+1<=array.length-1&&array[middle+1]>k)?middle:getCount(array,k,middle+1,end,1);
                System.out.println(m+" "+n);
                if(flag == 0)
                    return 0;
                return n-m+1;
            } else {
                int result = -1;
                if(type == 0) {
                    result = (middle-1>0&& array[middle-1]<k) ? middle:getCount(array,k,begin,middle-1,type);
                } else {
                    result = (middle+1<=array.length-1&&array[middle+1]>k)?middle:getCount(array,k,middle+1,end,type);
                }
                return result;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3};
        System.out.println(new Main().GetNumberOfK(array,2));
    }
}
