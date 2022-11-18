package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int k = 8;
        for (int i = 0;i <= cathetusLength;i++){
            for (int j = 1; j <= i;j++){
                System.out.println(k + "");
            }
            System.out.println();
            k++;
        }
    }
}
