package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int k = 8;
        for (int i = 0; i < length;i++){
            System.out.println(k + "");
            for (int j = 0;j < height;j++){
                System.out.println(k + "");
            }
            System.out.println();

        }
    }
}
