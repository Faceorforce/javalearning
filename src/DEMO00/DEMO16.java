package DEMO00;

public class DEMO16 {
    public static void main(String[] args) {
        int[]array = {5,21,45,23,67,45,89,24,1};

        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值" + min);
    }
}
