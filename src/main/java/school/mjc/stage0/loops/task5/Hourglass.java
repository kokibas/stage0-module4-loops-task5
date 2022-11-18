package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = height; i < 0;i--){
            for (int j = 1;j < height + 1; j++){
                if (i <= j)
                System.out.println("8");
            }
            System.out.println();
        }
    }
}
