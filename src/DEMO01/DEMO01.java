package DEMO01;

public class DEMO01 {
    public static void main(String[] args) {
        int[] array = {5,15,20,100,25};

        int max = getMax(array);
        System.out.println("最大值" + max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}
