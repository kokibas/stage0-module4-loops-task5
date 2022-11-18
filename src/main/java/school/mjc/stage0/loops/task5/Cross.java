package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i <= sideLength;i++){

            for (int j = 0; j <= sideLength;j++){
                if (i == j){
                  System.out.println("8");
                }
                System.out.println("8");
            }
        }
    }
}
