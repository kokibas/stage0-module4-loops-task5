package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < length;i++){
            for (int j = 0;j < height;j++){
                if (i >= j)
                System.out.println("8");
            }
            System.out.println("\n");
        }
    }
}
